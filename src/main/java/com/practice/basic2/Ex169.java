/**
 * Write a Java program to reverse the content of a sentence (assume a single space between two words) without reverse every word.
 * Input a string: The quick brown fox jumps over the lazy dog
 * Result: dog lazy the over jumps fox brown quick The
 */
package com.practice.basic2;

import java.util.Scanner;

public class Ex169 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String text = scanner.nextLine();
        scanner.close();

        System.out.println("Result: " + reverseStringWord(text));

    }

    private static String reverseStringWord(String input) {
        if (input == null)
            throw new IllegalArgumentException("Input cannot be null.");

        StringBuilder stringBuilder = new StringBuilder();
        String[] words = input.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            stringBuilder.append(words[i]);
            if (i != 0)
                stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

}
