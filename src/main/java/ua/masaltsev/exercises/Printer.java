package ua.masaltsev.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Printer {

    public static String printerError(String s) {
        // your code

        Pattern pattern = Pattern.compile("[a-m]");
        Matcher matcher;
        int errorAmount = 0;

        for (char c : s.toCharArray()) {
            matcher = pattern.matcher(Character.toString(c));
            if (!matcher.find()) {
                errorAmount++;
            }
        }

        return String.format("%d/%d", errorAmount, s.length());

    }

}
