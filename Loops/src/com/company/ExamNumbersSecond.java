package com.company;

import java.util.Scanner;

public class ExamNumbersSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startInterval = scanner.nextInt();
        int endInterval = scanner.nextInt();
        int targetSum = scanner.nextInt();

        for (int i = startInterval; i <= endInterval; i++) {
            int firstDigit = i / 100;
            int secondDigit = (i / 10) % 10;
            int thirdDigit = i % 10;
            int sum = firstDigit + secondDigit + thirdDigit;
            if (sum == targetSum) {
                System.out.println(i);
            }
        }
    }
}
