package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(", ");
        Integer[] numbers = new Integer[elements.length];

        for (int i = 0; i < elements.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
        }
        Arrays.sort(numbers, Collections.reverseOrder());
        String output = Arrays.toString(numbers).replace("[", "").replace("]", "");
        System.out.println(output);
    }
}
