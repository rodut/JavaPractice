/**
 *  Write a Java program to reverse a string.
 *  Input Data:
 * Input a string: The quick brown fox
 * Expected Output
 * Reverse string: xof nworb kciuq ehT
 */

package com.practice.basic1;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string: ");
        String input = scanner.nextLine();
        StringBuilder string = new StringBuilder();
        string.append(input);
        string = string.reverse();
        System.out.println("Reverse string: " + string);
    }
}
