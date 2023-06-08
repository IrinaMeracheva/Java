package com.company;

import java.util.Scanner;

public class CombineLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstList = scanner.nextLine().split(",");
        String[] secondList = scanner.nextLine().split(",");
        String[] result = new String[firstList.length + secondList.length];

        int position = 0;

        for (int i = 0; i < result.length; i += 2) {
            result[i] = firstList[position];
            result[i + 1] = secondList[position];
            position++;
        }
        System.out.println(String.join(",", result));
    }
}
