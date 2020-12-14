/**
 * Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
 * Test Data
 * Input an integer between 0 and 1000: 565
 * Expected Output :
 * The sum of all digits in 565 is 16
 */

package com.practice.datatypes;

import java.util.Scanner;

public class Ex3AddDigitsInInteger {
    public static void main(String[] args) {

        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int m = scanner.nextInt();
        while (m > 0 && m < 1000) {
            int n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("The sum of all digits in " + m + " is " + sum);
    }
}
