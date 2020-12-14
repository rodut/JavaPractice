/**
 * Write a Java program to reverse a word.
 * Sample Output:
 * Input a word: tsaf
 * Reverse word: fast
 */

package com.practice.basic1;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a word: ");
        String input = scanner.nextLine();

        StringBuilder string = new StringBuilder();
        string.append(input);
        string = string.reverse();
        System.out.println("Result: " + string);

    }
}
