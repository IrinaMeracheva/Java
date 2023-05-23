package com.company;

import java.util.Scanner;

public class Tips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double tips = 0.1;
        int price = scanner.nextInt();

        double totalPrice = price + (price * tips);
        System.out.printf("%.0f", totalPrice);
    }
}
