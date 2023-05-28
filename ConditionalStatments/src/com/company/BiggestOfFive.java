package com.company;

import java.util.Scanner;

public class BiggestOfFive {
    public static void main(String[] args) {
//        Description
//Write a program that finds the biggest of 5 numbers, using only 5 if statements.
//
//Input
//Read from the standard input.
//
//On the first 5 lines, you will receive the 5 numbers, each on a separate line
//Output
//Print to the standard output.
//
//Write the biggest of the five numbers on the only output line.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        int biggestOne = Math.max(a, Math.max(b, c));
        int biggestTwo = Math.max(d, e);

        if (biggestOne > biggestTwo) {
            System.out.println(biggestOne);
        }else {
            System.out.println(biggestTwo);
        }
    }
}
