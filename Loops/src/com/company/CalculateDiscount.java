package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CalculateDiscount {

    private static final double DISCOUNT = 0.65;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfItems = scanner.nextInt();
        double priceAfterDisc = 0;
        for (int i = 1; i <= numOfItems ; i++) {
            double priceItem = scanner.nextDouble();
            priceAfterDisc = priceItem - (priceItem * DISCOUNT);
            BigDecimal rounded = BigDecimal.valueOf(priceAfterDisc);
            rounded = rounded.setScale(2, RoundingMode.HALF_UP.HALF_UP);
            System.out.println(rounded);
        }
    }
}
