//Given a string s, return true if the s can be palindrome after deleting at most one character from it.

package ua.masaltsev.exercises;

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        boolean isMismatchPresent = false;

        int leftIndex = 0;
        int rightIndex = chars.length-1;

        while (leftIndex != rightIndex) {
            if (chars[leftIndex] == chars[rightIndex]) {
                leftIndex++;
                rightIndex--;
            } else {
                if (!isMismatchPresent) {
                    if (chars[leftIndex+1] == chars[rightIndex]) {

                    }
                } else {
                    return false;
                }
            }
            return true;
        }
    }
}