package com.company;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double gallon = 4.54;
        final double mile = 1.6;

        int m = scanner.nextInt();
        double km = m * mile;

        double litres = Math.floor((gallon * 100) / km);
        System.out.printf("%.0f litres per 100 km", litres);
    }
}
