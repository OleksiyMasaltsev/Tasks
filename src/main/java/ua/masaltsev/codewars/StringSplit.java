package ua.masaltsev.codewars;

public class StringSplit {
    public static String[] solution(String s) {
        //Write your code here
        int inputLength = s.length();

        if (inputLength % 2 != 0) {
            s = s.concat("_");
        }

        String[] result = new String[s.length() / 2];

        int index = 0;

        for (int i = 0; i < result.length; i++) {
            result[i] = s.substring(index, index + 2);
            index += 2;
        }

        return result;

    }
}
