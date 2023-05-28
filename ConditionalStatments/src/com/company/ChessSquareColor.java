package com.company;

import java.util.Locale;
import java.util.Scanner;

public class ChessSquareColor {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String label = scanner.nextLine().toLowerCase(Locale.ROOT);
        int ranks = scanner.nextInt();
        if(ranks % 2 == 0) {
            switch (label) {
                case "a":
                case "c":
                case "e":
                case "g":
                    System.out.println("light");
                    break;
                default:
                    System.out.println("dark");
            }
        }else if(ranks % 2 == 1) {
            switch (label) {
                case "a":
                case "c":
                case "e":
                case "g":
                    System.out.println("dark");
                    break;
                default:
                    System.out.println("light");
            }
        }
    }
}