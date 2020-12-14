/**
 * Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.
 * (Do not use Java built-in method)
 */
package com.practice.forloops;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the base number: ");
        int base = scanner.nextInt();
        System.out.print("Input the power number: ");
        int power = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= power ; i++) {
//            result *= base;
            result = result * base;
        }
        System.out.println("Result: " + result);
    }
}
