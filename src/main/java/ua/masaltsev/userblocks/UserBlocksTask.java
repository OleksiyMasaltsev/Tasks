/**
 * Implement a service that receives a text block
 * (a string with multiple lines split by '\n')
 * and returns a list of the user objects created out of it.
 *
 * Requirements:
 * - User is a POJO with two string fields: name and email.
 * - Each line must be validated for containing exactly one email and a name.
 * - Line format might be one of following:
    "name email"
    "email name"
 * - Validate email using EmailValidator by Apache Commons.
 * - The same email should not appear in different lines.
 *
 * If an invalid data arrives, an exception must be thrown with the description of which line contains corrupted data.
 * Write unit tests to cover all possible test cases.
 */

package ua.masaltsev.userblocks;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.*;

public class UserBlocksTask {

    public static final String VALID_EMAIL_NOT_FOUND_IN_LINE = "Wrong input data: valid email not found in line #";
    public static final String TWO_VALID_EMAILS_IN_LINE = "Wrong input data: 2 valid emails in the line #";
    public static final String NOT_ENOUGH_INFO_IN_LINE = "Wrong input data: not enough info in the line #";

    private final Set<String> uniqueEmails = new HashSet<>();

    public List<User> extractUsersFrom(String input) {

        final List<User> userList = new ArrayList<>();

        String[] inputArray = input.split("\n");
        int lineCounter = 0;

        for (String inputLine : inputArray) {
            lineCounter++;
            User user = getValidUser(inputLine.trim(), lineCounter);
            if (isEmailUnique(user.getEmail())) {
                userList.add(user);
            }
        }

        return userList;
    }

    private boolean isEmailUnique(String email) {
        if (!uniqueEmails.contains(email)) {
            uniqueEmails.add(email);
            return true;
        } else return false;
    }

    private User getValidUser(String inputLine, int lineCounter) {

        String[] inputLineArray = inputLine.split(" ");
        String firstElement;
        String lastElement;

        if (inputLineArray.length > 1) {
            firstElement = inputLineArray[0];
            lastElement = inputLineArray[inputLineArray.length-1];
        } else {
            throw new WrongInputException(NOT_ENOUGH_INFO_IN_LINE + lineCounter);
        }

        EmailValidator validator = EmailValidator.getInstance();
        String name;
        String email;
        boolean isFirstValid = validator.isValid(firstElement);
        boolean isLastValid = validator.isValid(lastElement);

        if (isFirstValid && isLastValid) {
            throw new WrongInputException(TWO_VALID_EMAILS_IN_LINE + lineCounter);
        }
        if (!isFirstValid && !isLastValid) {
            throw new WrongInputException(VALID_EMAIL_NOT_FOUND_IN_LINE + lineCounter);
        } else if (isFirstValid){
            email = firstElement;
            name = inputLine.substring(inputLine.indexOf(" ")+1);
            return new User(name, email);
        } else {
            email = lastElement;
            name = inputLine.substring(0, inputLine.lastIndexOf(" "));
            return new User(name, email);
        }
    }
}

















