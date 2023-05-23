package com.company;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;
        int diff = Math.abs(b - a);
        int product = a * b;
        int remainder = a % b;
        double pow = Math.pow(a, b);

        System.out.printf("%d%n%d%n%d%n%d%n%.0f%n", sum, diff, product, remainder, pow);
    }
}
