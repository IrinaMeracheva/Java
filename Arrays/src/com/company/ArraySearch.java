package com.company;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",");
        String missing = "";
        for (int i = 1; i <= input.length ; i++) {
            boolean isFound = false;
            for (String number : input) {
                if (i == Integer.parseInt(number)) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                if (missing.length() > 0) {
                    missing += ",";
                }
                missing += i;
            }
        }
        System.out.println(missing);

    }
}
