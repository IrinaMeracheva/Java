package com.company;

import java.util.Scanner;

public class MinMaxSumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;
        double avr = 0;

        for (int i = 1; i <= number ; i++) {
            double num = scanner.nextDouble();
            sum += num;
            avr = sum / number;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            if (number == 1) {
                min = max = num;
            }
        }
        if (max == Double.MIN_VALUE && min < 0) {
            max = min;
        }
        System.out.printf("min=%.2f%nmax=%.2f%nsum=%.2f%navg=%.2f",
                min, max, sum, avr);
    }
}
