package com.company;

import java.util.Scanner;
//Description
//Write a program that enters 3 real numbers and prints them sorted in descending order.
//
//Use nested if statements.
//Don’t use arrays and the built-in sorting functionality.
//Input
//On the first three lines, you will receive the three numbers, each on a separate line.
//Output
//Output a single line on the console - the sorted numbers, separated by a white space
//Constraints
//The three numbers will always be valid integer numbers in the range [-1000, 1000]

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b && a > c) {
            if (b > c) {
                System.out.printf("%d %d %d", a,b,c);
            }else {
                System.out.printf(" %d %d %d", a, c, b);
            }
        }
        if (b > a && b > c) {
            if (a > c) {
                System.out.printf("%d %d %d", b, a, c);
            }else {
                System.out.printf("%d %d %d",b, c, a);
            }
        }
        if(c > a && c > b) {
            if (a > b) {
                System.out.printf("%d %d %d",c, a, b);
            }else {
                System.out.printf("%d %d %d", c, b, a);
            }
        }
        if (a == b && b == c) {
            System.out.printf("%d %d %d", a, b, c);
        }
    }
}
