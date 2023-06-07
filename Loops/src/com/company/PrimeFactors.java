package com.company;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 2; i <= number ; i++) {
            while (number % i == 0) {
                System.out.println(i + " ");
                number /= i;
            }
        }
        if (number > 2) {
            System.out.println(number);
        }
    }
}
