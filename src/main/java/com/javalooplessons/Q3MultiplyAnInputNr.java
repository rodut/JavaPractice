/**
 * Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
 */

package com.javalooplessons;

import java.util.Scanner;

public class Q3MultiplyAnInputNr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int number = scanner.nextInt();
        if (number > 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + i * number);
            }
        } else {
            System.out.println("You entered a non-positive number.");
        }
    }
}
