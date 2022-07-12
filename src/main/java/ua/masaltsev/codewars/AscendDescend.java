/**
 * You are given three integer inputs: length, minimum, and maximum.
 * <p>
 * Return a string that:
 * <p>
 * Starts at minimum
 * Ascends one at a time until reaching the maximum, then
 * Descends one at a time until reaching the minimum
 * repeat until the string is the appropriate length
 * Examples:
 * <p>
 * length: 5, minimum: 1, maximum: 3   ==>  "12321"
 * length: 14, minimum: 0, maximum: 2  ==>  "01210121012101"
 * length: 11, minimum: 5, maximum: 9  ==>  "56789876567"
 * Notes:
 * <p>
 * length will always be non-negative
 * negative numbers can appear for minimum and maximum values
 * hyphens/dashes ("-") for negative numbers do count towards the length
 * the resulting string must be truncated to the exact length provided
 * return an empty string if maximum < minimum or length == 0
 * minimum and maximum can equal one another and result in a single number repeated for the length of the string
 */

package ua.masaltsev.codewars;

public class AscendDescend {

    public static String ascendDescend(int length, int minimum, int maximum) {

        StringBuilder result = new StringBuilder();
        boolean isUp = true;
        int number = minimum;

        if (maximum < minimum || length == 0) {
            return result.toString();
        } else if (maximum == minimum) {
            for (int i = 0; i < length; i++) {
                result.append(number);
            }
            return result.toString();
        } else {
            while (result.length() < length) {
                result.append(number);
                if (isUp) {
                    if (number < maximum) {
                        number = number + 1;
                    } else if (number == maximum) {
                        isUp = false;
                        number = number - 1;
                    }
                } else {
                    if (number > minimum) {
                        number = number - 1;
                    } else if (number == minimum) {
                        isUp = true;
                        number = number + 1;
                    }
                }
            }
        }
        return result.substring(0, length);
    }
}
