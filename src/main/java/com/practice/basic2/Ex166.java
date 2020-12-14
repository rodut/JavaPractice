/**
 * Write a Java program to transform a given integer to String format.
 * Expected Output:
 * Input an integer: 35
 * String format of the said integer: 35
 */

package com.practice.basic2;

import java.util.Scanner;

public class Ex166 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = scanner.nextInt();
        scanner.close();

//        String result = Integer.toString(number);
        String result = String.valueOf(number);
        System.out.print("String format of the said integer: " + result);
    }

}
