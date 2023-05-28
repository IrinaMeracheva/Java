package com.company;

import java.util.Scanner;

public class PhoneBill {

    private static final double PRICE_MESSAGE = 0.06;
    private static final double PRICE_MINUTE = 0.10;
    private static final double SALES_TAX = 0.2;
    private static final double TOTAL_BILL = 12.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTextMessages = scanner.nextInt();
        int totalMinutes = scanner.nextInt();
        int additionalTextMess = 0;
        int additionalMinutes = 0;
        double additionalPriceMessage = 0;
        double additionalPriceMinutes = 0;
        double totalAdditionalTaxes = 0;
        double totalBill = TOTAL_BILL;
        if (totalTextMessages > 20) {
            additionalTextMess = totalTextMessages - 20;
            additionalPriceMessage = additionalTextMess * PRICE_MESSAGE;
        }
        if (totalMinutes > 60) {
            additionalMinutes = totalMinutes - 60;
            additionalPriceMinutes = additionalMinutes * PRICE_MINUTE;
        }
        totalAdditionalTaxes = (additionalPriceMinutes + additionalPriceMessage) * SALES_TAX;
        totalBill = TOTAL_BILL + additionalPriceMessage + additionalPriceMinutes + totalAdditionalTaxes;
        System.out.printf("%d additional messages for %.2f levas%n%d additional minutes for %.2f levas%n%.2f " +
                        "additional taxes%n%.2f total bill",
                additionalTextMess, additionalPriceMessage, additionalMinutes, additionalPriceMinutes,
                totalAdditionalTaxes, totalBill);
    }
}
