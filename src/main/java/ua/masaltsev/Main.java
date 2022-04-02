package ua.masaltsev;

import ua.masaltsev.exercises.TwoSum;
import ua.masaltsev.opt.Computer;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        int[] input = {3, 2, 4};
        for (int i:
                new TwoSum().twoSum(input, 6)) {
            System.out.print(i + " ");
        }
    }
}
