package com.company;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();

        int daysInHours = d * 24;
        int hoursInMins = (daysInHours + h) * 60;
        int minsInSeconds = (m + hoursInMins) * 60;
        int totalSeconds = minsInSeconds + s;
        System.out.println(totalSeconds);
    }
}
