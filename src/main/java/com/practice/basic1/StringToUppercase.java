/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Output:
 * Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * the quick brown fox jumps over the lazy dog.
 */
package com.practice.basic1;

import java.util.Scanner;

public class StringToUppercase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a String: ");
        String message = scanner.nextLine();

        System.out.println("Result: " + message.toLowerCase());
    }
}
