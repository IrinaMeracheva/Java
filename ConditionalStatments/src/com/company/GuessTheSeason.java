package com.company;

import java.util.Scanner;

public class GuessTheSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month  = scanner.nextLine().toLowerCase();
        int date = scanner.nextInt();

        switch (month) {
            case "march":
                if (date >= 20) {
                    System.out.println("Spring");
                }else {
                    System.out.println("Winter");
                }
                break;
            case "april":
            case "may":
                System.out.println("Spring");
                break;
            case "june":
                if (date < 21) {
                    System.out.println("Spring");
                }else {
                    System.out.println("Summer");
                }
                break;
            case "july":
            case "august":
                System.out.println("Summer");
                break;
            case "september":
                if (date < 22) {
                    System.out.println("Summer");
                }else {
                    System.out.println("Autumn");
                }
                break;
            case "october":
            case "november":
                System.out.println("Autumn");
                break;
            case "december":
                if (date < 21) {
                    System.out.println("Autumn");
                }else {
                    System.out.println("Winter");
                }
                break;
            case "january":
            case "february":
                System.out.println("Winter");
                break;
        }
    }
}
