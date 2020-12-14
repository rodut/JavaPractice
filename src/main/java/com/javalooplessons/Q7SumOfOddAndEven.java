/**
 * Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
 */
package com.javalooplessons;

import java.util.Arrays;
import java.util.Scanner;

public class Q7SumOfOddAndEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, evenSum = 0, oddSum = 0;
        char choice;

        do {
            System.out.print("Enter the number: ");
            number = scanner.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

            System.out.print("Do you want to continue y/n?");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
        System.out.println("The sum of even numbers is: " + evenSum);
        System.out.println("The sum of odd numbers is: " + oddSum);

    }
}
