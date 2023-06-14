package com.company;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",");
        int[] numbers = new int[input.length];
        int[] result = new int[numbers.length];
        int position = 0;
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
            if (numbers[i] != 0) {
                result[position++] = numbers[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int number:result) {
            sb.append(Integer.toString(number)).append(",");
        }
        System.out.println(sb.toString().substring(0, sb.length() - 1));
    }
}
