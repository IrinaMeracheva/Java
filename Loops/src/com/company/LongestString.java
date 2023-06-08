package com.company;

import java.util.Locale;
import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int maxLength = 0;
        String longest = "";

        while (!"END".equals(input.toUpperCase(Locale.ROOT))) {
            String inputLunch = input;
            int inputSize = inputLunch.length();
            if (inputSize >= maxLength) {
                maxLength = inputSize;
                longest = input;
            }
            input = scanner.nextLine();
        }
        System.out.println(longest);
    }
}
