/**
 * Write a Java program that accepts two integers from the user and then prints the sum, the difference,
 * the product, the average, the distance (the difference between integer), the maximum (the larger of the two integers),
 * the minimum (smaller of the two integers).
 * Test Data
 * Input 1st integer: 25
 * Input 2nd integer: 5
 * Expected Output :
 * Sum of two integers: 30
 * Difference of two integers: 20
 * Product of two integers: 125
 * Average of two integers: 15.00
 * Distance of two integers: 20
 * Max integer: 25
 * Min integer: 5
 */

package com.practice.datatypes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex9TwoIntArithmetic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int firstInt = scanner.nextInt();
        System.out.print("Input the second integer: ");
        int secondInt = scanner.nextInt();

        System.out.println("Sum of two integers: " + countSum(firstInt, secondInt));
        System.out.println("Difference of two integers: " + countDifference(firstInt, secondInt));
        System.out.println("Product of two integers: " + countProduct(firstInt, secondInt));
        System.out.println("Average of two integers: " + countAverage(firstInt, secondInt));
        System.out.println("Max integer: " + Math.max(firstInt, secondInt));
        System.out.println("Min integer: " + Math.min(firstInt, secondInt));
    }

    private static int countSum(int x, int y) {
        return x + y;
    }

    private static int countDifference(int x, int y) {
        return x - y;
    }

    private static int countProduct(int x, int y) {
        return x * y;
    }

    private static double countAverage(double x, double y) {
        return (x + y) / 2;
    }
}
