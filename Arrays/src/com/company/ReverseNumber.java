package com.company;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split("");

        for (int i = elements.length - 1; i >= 0 ; i--) {
            System.out.print(elements[i]);
        }
    }
}
