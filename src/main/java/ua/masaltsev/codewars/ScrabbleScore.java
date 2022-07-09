/**
 * DESCRIPTION:
 * Write a program that, given a word, computes the scrabble score for that word.
 *
 * Letter Values
 * You'll need these:
 *
 * Letter                           Value
 * A, E, I, O, U, L, N, R, S, T       1
 * D, G                               2
 * B, C, M, P                         3
 * F, H, V, W, Y                      4
 * K                                  5
 * J, X                               8
 * Q, Z                               10
 * Examples
 * "cabbage" --> 14
 * "cabbage" should be scored as worth 14 points:
 *
 * 3 points for C
 * 1 point for A, twice
 * 3 points for B, twice
 * 2 points for G
 * 1 point for E
 * And to total:
 *
 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 14
 *
 * Empty string should return 0. The string can contain spaces and letters (upper and lower case),
 * you should calculate the scrabble score only of the letters in that string.
 *
 * ""           --> 0
 * "STREET"    --> 6
 * "st re et"    --> 6
 * "ca bba g  e" --> 14
 */

package ua.masaltsev.codewars;

import java.util.regex.Pattern;

public class ScrabbleScore {
    public static int scrabbleScore(String word) {
        //solution
        Pattern valueOne = Pattern.compile("[AEIOULNRST]", Pattern.CASE_INSENSITIVE);
        Pattern valueTwo = Pattern.compile("[DG]", Pattern.CASE_INSENSITIVE);
        Pattern valueThree = Pattern.compile("[BCMP]", Pattern.CASE_INSENSITIVE);
        Pattern valueFour = Pattern.compile("[FHVWY]", Pattern.CASE_INSENSITIVE);
        Pattern valueFive = Pattern.compile("K", Pattern.CASE_INSENSITIVE);
        Pattern valueEight = Pattern.compile("[JX]", Pattern.CASE_INSENSITIVE);
        Pattern valueTen = Pattern.compile("[QZ]", Pattern.CASE_INSENSITIVE);

        int score = 0;

        for (String letter : word.split("")) {
            if (valueOne.matcher(letter).find()) {
                score += 1;
            }
            if (valueTwo.matcher(letter).find()) {
                score += 2;
            }
            if (valueThree.matcher(letter).find()) {
                score += 3;
            }
            if (valueFour.matcher(letter).find()) {
                score += 4;
            }
            if (valueFive.matcher(letter).find()) {
                score += 5;
            }
            if (valueEight.matcher(letter).find()) {
                score += 8;
            }
            if (valueTen.matcher(letter).find()) {
                score += 10;
            }
        }

        return score;
    }
}
