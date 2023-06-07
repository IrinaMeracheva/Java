package com.company;

import java.util.Scanner;

public class CalculateComplexSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float x = scanner.nextFloat();
//      calculates the sum S = 1 + 1!/x + 2!/x2 + … + N!/xN
        float sum = 1;
        float previousElement = 1;

        for (int i = 1; i <= n ; i++) {
            previousElement *= i;
            sum = sum + previousElement / (float) Math.pow(x, i);
        }
        System.out.printf("%.5f", sum);
    }
}
