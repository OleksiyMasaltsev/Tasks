/**
 * Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive.
 * The string can contain any char.
 *
 * Examples input/output:
 *
 * XO("ooxx") => true
 * XO("xooxx") => false
 * XO("ooxXm") => true
 * XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
 * XO("zzoo") => false*/

package ua.masaltsev.codewars;

import java.util.Arrays;

public class XO {

    public static boolean getXO (String str) {

        long x_amount = Arrays.stream(str.split(""))
                .filter(letter -> letter.equalsIgnoreCase("x"))
                .count();

        long o_amount = Arrays.stream(str.split(""))
                .filter(letter -> letter.equalsIgnoreCase("o"))
                .count();

        return x_amount == o_amount;

    }

}
