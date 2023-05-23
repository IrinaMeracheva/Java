package com.company;

import java.util.Scanner;

public class BottleDeposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numHalfBottle = scanner.nextInt();
        int numBottle = scanner.nextInt();

        double totalPrice = numHalfBottle * 0.1 + numBottle * 0.25;
        System.out.printf("%.2f", totalPrice);
    }
}
