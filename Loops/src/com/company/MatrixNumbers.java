package com.company;

import java.util.Scanner;

public class MatrixNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = "";
        for (int i = 1; i <= number ; i++) {
            for (int j = i; j < number + i; j++) {
                result += j + " ";
            }
            System.out.println(result);
            result = "";
        }
    }
}
