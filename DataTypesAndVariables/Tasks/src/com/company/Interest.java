package com.company;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double percentYear = 0.05;
        int num = scanner.nextInt();
        double firstYearDeposit = num + (num * percentYear);
        double secondYearDeposit = firstYearDeposit + (firstYearDeposit * percentYear);
        double thirdYearDeposit = secondYearDeposit + (secondYearDeposit * percentYear);

        System.out.printf("%.2f%n%.2f%n%.2f", firstYearDeposit, secondYearDeposit, thirdYearDeposit);

    }
}
