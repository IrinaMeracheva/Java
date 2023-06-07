package com.company;

import java.util.Scanner;

public class OddAndEvenProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        int oddProduct = 1;
        int evenProduct = 1;
        for (int i = 1; i <= lines ; i++) {
            int number = scanner.nextInt();
            if (i % 2 == 0) {
                evenProduct *= number;
            }else {
                oddProduct *= number;
            }
        }
        if (oddProduct == evenProduct) {
            System.out.printf("yes %d", evenProduct);
        }else {
            System.out.printf("no %d %d", oddProduct, evenProduct);
        }
    }
}
