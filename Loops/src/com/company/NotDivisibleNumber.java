package com.company;

import java.util.Scanner;

public class NotDivisibleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= number ; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
