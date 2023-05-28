package com.company;

import java.util.Scanner;

public class DogYears {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int dogYears = 0;
        if(number <= 2) {
            dogYears = number * 10;
        }else {
            dogYears = 20 + (number - 2) * 4;
        }
        System.out.println(dogYears);
    }
}
