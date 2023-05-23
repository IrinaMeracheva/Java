package com.company;

import java.util.Scanner;

public class SumPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = number * (number + 1) / 2;
        System.out.println(sum);
    }
}
