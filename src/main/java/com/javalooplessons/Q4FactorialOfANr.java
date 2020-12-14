/**
 * Write a program to find the factorial value of any number entered through the keyboard.
 */

package com.javalooplessons;

import java.util.Scanner;

public class Q4FactorialOfANr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i; // factorial = factorial * i;
        }
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
