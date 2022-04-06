//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000

package ua.masaltsev.exercises;

import java.util.*;
import java.util.stream.Stream;

public class Roman {
    public int romanToInt(String s) {

        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            char c = s.charAt(i);
            char previous;

            switch (c) {
                case 'M':
                    result += 1000;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'C':
                    if (i < s.length() - 1) {
                        previous = s.charAt(i + 1);
                        if (previous == 'M' || previous == 'D') {
                            result -= 100;
                        } else {
                            result += 100;
                        }
                    } else {
                        result += 100;
                    }
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'X':
                    if (i < s.length() - 1) {
                        previous = s.charAt(i + 1);
                        if (previous == 'L' || previous == 'C') {
                            result -= 10;
                        } else {
                            result += 10;
                        }
                    } else {
                        result += 10;
                    }
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'I':
                    if (i < s.length() - 1) {
                        previous = s.charAt(i + 1);
                        if (previous == 'V' || previous == 'X') {
                            result -= 1;
                        } else {
                            result += 1;
                        }
                    } else {
                        result += 1;
                    }
                    break;
            }
        }
        return result;
    }

//    public int checkPrev(String s, int index) {
//
//    }
}



















