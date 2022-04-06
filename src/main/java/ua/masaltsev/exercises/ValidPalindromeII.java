//Given a string s, return true if the s can be palindrome after deleting at most one character from it.

package ua.masaltsev.exercises;

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return (isPolindrome(s, i+1, j) || isPolindrome(s, i, j-1));
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isPolindrome(String s, int i, int j) {
        while(i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
