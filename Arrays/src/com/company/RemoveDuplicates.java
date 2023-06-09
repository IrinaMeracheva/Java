package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",");
        List<String> result = new LinkedList<>();

        for (int i = 0; i < input.length; i++) {
            if (!result.contains(input[i])) {
                result.add(input[i]);
            }
        }
        System.out.println(String.join(",", result));
    }
}
