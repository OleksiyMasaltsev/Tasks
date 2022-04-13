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

    private final Set<String> uniqueEmails = new HashSet<>();

    public List<User> extractUsersFrom(String input) throws WrongInputException {

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

    private User getValidUser(String inputLine, int lineCounter) throws WrongInputException {

        String[] inputLineArray = inputLine.split(" ");

        String s1 = inputLineArray[0];
        String s2 = inputLineArray[inputLineArray.length-1];

        EmailValidator validator = EmailValidator.getInstance();
        String name;
        String email;

        if (validator.isValid(s1) && validator.isValid(s2)) {
            throw new WrongInputException("Wrong input data: 2 valid emails in line #" + lineCounter);
        }
        if (!validator.isValid(s1) && !validator.isValid(s2)) {
            throw new WrongInputException("Wrong input data: valid email not found in line #" + lineCounter);
        } else if (validator.isValid(s1)){
            email = s1;
            name = inputLine.substring(inputLine.indexOf(" ")+1);
            return new User(name, email);
        } else {
            email = s2;
            name = inputLine.substring(0, inputLine.lastIndexOf(" "));
            return new User(name, email);
        }
    }
}


// trim - done!
// check there are no email duplicates
// describe exception messages - done!












