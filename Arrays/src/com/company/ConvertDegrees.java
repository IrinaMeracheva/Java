package com.company;

import java.util.Scanner;

public class ConvertDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        double[] num = new double[input.length];
        double fahrenheit = 0;
        for (int i = 0; i < input.length; i++) {
            num[i] = Integer.parseInt(input[i]);
        }
        for (double number:num) {
            fahrenheit = number * 1.8 + 32;
            System.out.println(Math.round(fahrenheit));
        }
    }
}
