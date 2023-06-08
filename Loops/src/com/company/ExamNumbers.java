package com.company;

import java.util.Scanner;

public class ExamNumbers {
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startInterval = scanner.nextInt();
        int endInterval = scanner.nextInt();
        int targetSum = scanner.nextInt();

        for (int i = startInterval; i <= endInterval; i++) {
            if (sumOfDigits(i) == targetSum) {
                System.out.println(i);
            }
        }
    }
}
