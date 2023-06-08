package com.company;

import java.util.Scanner;

public class DistantWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());

        String word[] = new String[lines];
        int result = 0;
        double sum = 0;

        for (int i = 0; i < lines; i++) {
            word[i] = scanner.nextLine();
        }
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word[i].length(); j++) {
                result += word[i].charAt(j) - 96;
            }
            System.out.println(word[i] + " " + Math.abs(targetNumber - result));
            sum +=  Math.abs(targetNumber - result);
            result = 0;
        }
        double average = sum / lines;
        System.out.printf("%.2f", Math.abs(average));
    }
}
