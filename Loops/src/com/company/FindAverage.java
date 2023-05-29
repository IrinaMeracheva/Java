package com.company;

import java.util.Scanner;

public class FindAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double sum = 0;
        double average = 0;
        for (int i = 1; i <= number ; i++) {
            double num  = scanner.nextDouble();
            sum += num;
            average = sum / number;
        }
        System.out.printf("%.2f", average);
    }
}
