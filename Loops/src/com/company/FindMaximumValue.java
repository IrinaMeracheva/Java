package com.company;

import java.util.Scanner;

public class FindMaximumValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        int maxNumber = -201;
        for (int i = 1; i <= lines ; i++) {
            int number = scanner.nextInt();
            if (maxNumber < number) {
                maxNumber = number;
            }
        }
        System.out.println(maxNumber);
    }
}
