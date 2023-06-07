package com.company;

import java.util.Scanner;

public class FindLargestThreeValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        int maxNumber = -501;
        int secMaxNumber = -501;
        int thirdMaxNumber = -501;
        for (int i = 1; i <= lines ; i++) {
            int number = scanner.nextInt();
            if (maxNumber < number) {
                thirdMaxNumber = secMaxNumber;
                secMaxNumber = maxNumber;
                maxNumber = number;
            }else if (number >= secMaxNumber && number <= maxNumber) {
                thirdMaxNumber = secMaxNumber;
                secMaxNumber = number;
            }else if (number >= thirdMaxNumber && number <= secMaxNumber) {
                thirdMaxNumber = number;
            }
        }
        System.out.printf("%d, %d and %d", maxNumber, secMaxNumber, thirdMaxNumber);
    }
}
