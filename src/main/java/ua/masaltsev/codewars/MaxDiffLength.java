/**You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z.
 * Let x be any string in the first array and y be any string in the second array.

 Find max(abs(length(x) − length(y)))

 If a1 and/or a2 are empty return -1 in each language except in Haskell (F#) where you will return Nothing (None).*/

package ua.masaltsev.codewars;

public class MaxDiffLength {
    public static int mxdiflg(String[] a1, String[] a2) {

        int diff1 = Math.abs(findMaxLength(a1) - findMinLength(a2));
        int diff2 = Math.abs(findMaxLength(a2) - findMinLength(a1));

        return Math.max(diff1, diff2);
    }

    private static int findMaxLength(String[] strings) {

        int max = strings[0].length();
        for (String s : strings) {
            int length = s.length();
            if (length > max) {
                max = length;
            }
        }
        return max;
    }

    private static int findMinLength(String[] strings) {

        int min = strings[0].length();
        for (String s : strings) {
            int length = s.length();
            if (length < min) {
                min = length;
            }
        }
        return min;
    }

}
