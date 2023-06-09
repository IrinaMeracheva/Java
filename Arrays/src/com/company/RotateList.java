package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RotateList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(",");
        int numberRotations = Integer.parseInt(scanner.nextLine());

        Collections.rotate(Arrays.asList(numbers), -numberRotations);
        System.out.println(String.join(",", numbers));
    }
}
