/**
 * Write a Java program to accept a number and check the number is even or not.
 * Prints "Even" if the number is even or "Odd" if the number is odd.
 */

package com.practice.basic1;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("You've selected an even number.");
        } else {
            System.out.println("You've selected an odd number.");
        }
    }
}
