package com.company;

import java.util.Scanner;

public class IsAListSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num >= 0 && num <= 10) {
            for (int i = 0; i < num; i++) {
                String[] elements = scanner.nextLine().split(",");
                boolean isSorted = true;
                for (int j = 0; j < elements.length - 1; j++) {
                    if (Integer.parseInt(elements[j]) > Integer.parseInt(elements[j+1])) {
                        isSorted = false;
                        break;
                    }
                }
                System.out.println(isSorted);
            }
        }
    }
}
