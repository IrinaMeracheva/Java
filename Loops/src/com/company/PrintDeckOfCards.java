package com.company;

import java.util.Scanner;

public class PrintDeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String card = scanner.nextLine();
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String s:cards) {
            System.out.print(s + " of spades, ");
            System.out.print(s + " of clubs, ");
            System.out.print(s + " of hearts, ");
            System.out.println(s + " of diamonds ");
            if(s.equals(card))
                break;
        }
    }
}
