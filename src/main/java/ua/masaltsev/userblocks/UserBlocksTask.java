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

    private static List<User> userList = new ArrayList<>();

    public static List<User> extractUsersFrom(String input) throws WrongInputException {

        String[] inputArray = input.split("\n");
        int lineCounter = 0;

        for (String inputLine : inputArray) {
            lineCounter++;
            String[] inputLineArray = inputLine.split(" ");
            String s1 = inputLineArray[0];
            String s2 = inputLineArray[1];
            userList.add(getValidUser(s1, s2, lineCounter));
        }

        return userList;
    }

    private static User getValidUser(String s1, String s2, int lineCounter) throws WrongInputException {

        EmailValidator validator = EmailValidator.getInstance();

        if (validator.isValid(s1) && validator.isValid(s2)) {
            throw new WrongInputException("Wrong input data in line " + lineCounter);
        }
        if (!validator.isValid(s1) && !validator.isValid(s2)) {
            throw new WrongInputException("Wrong input data in line " + lineCounter);
        } else if (validator.isValid(s1)){
            return new User(s2, s1);
        } else {
            return new User(s1, s2);
        }
    }
}















