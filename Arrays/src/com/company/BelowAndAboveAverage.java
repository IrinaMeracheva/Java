package com.company;

import java.util.Scanner;

public class BelowAndAboveAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(",");
        int[] numbers = new int[elements.length];
        double sum = 0;
        double avr = 0;
        StringBuilder below = new StringBuilder();
        StringBuilder above = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
            sum += numbers[i];
            avr = sum / numbers.length;
        }
        for (int number:numbers) {
            if (number < avr) {
                below.append(number).append(",");
            }else if (number > avr) {
                above.append(number).append(",");
            }
        }
        System.out.printf("avg: %.2f%n", avr);
        System.out.println("below: " + below.toString().substring(0, below.length() - 1));
        System.out.println("above: " + above.toString().substring(0, above.length() - 1));
    }
}
