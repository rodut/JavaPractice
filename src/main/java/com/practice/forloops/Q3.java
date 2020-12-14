/**
 * Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
 */
package com.practice.forloops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a positive number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            int multiply = number * i;
            System.out.println(number + " x " + i + " = " + multiply);
        }

    }
}
