/**
 * Write a Java program to find the penultimate (next to last) word of a sentence.
 * Sample Output:
 * Input a String: The quick brown fox jumps over the lazy dog.
 * Penultimate word: lazy
 */

package com.practice.basic1;

import java.util.Scanner;

public class PenultimateWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a String: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        String word = words[words.length - 2];
        System.out.println("Result: " + word);
    }
}
