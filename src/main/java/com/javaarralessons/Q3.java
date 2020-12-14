/**
 * Write a program that creates an array of 10 elements size.
 * Your program should prompt the user to input numbers in array and then display the sum of all array elements.
 */

package com.javaarralessons;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        final int SIZE = 10;
        int[] numbers = new int[SIZE];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + SIZE + " numbers: ");

        // Get the numbers from the user
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calc the sum
        for (int i = 0; i < SIZE; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum of numbers " + sum);
    }
}
