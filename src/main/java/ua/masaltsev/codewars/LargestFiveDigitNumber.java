package ua.masaltsev.codewars;

public class LargestFiveDigitNumber {

    public static int solve(final String digits) {

        int left = 0;
        int right = 5;

        int result = Integer.parseInt(digits.substring(left, right));

        while (right <= digits.length()) {

            int number = Integer.parseInt(digits.substring(left, right));

            if (number > result) {
                result = number;
            }

            left++;
            right++;

        }

        return result; // you code here
    }
}
