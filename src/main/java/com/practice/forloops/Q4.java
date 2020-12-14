/**
 * Write a program to find the factorial value of any number entered through the keyboard.
 */

package com.practice.forloops;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a positive number: ");
        int number = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= number ; ++i) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " = " + factorial);
    }
}
