/**
 * Write a Java program to capitalize the first letter of each word in a sentence.
 * Sample Output:
 * Input a Sentence: the quick brown fox jumps over the lazy dog.
 * The Quick Brown Fox Jumps Over The Lazy Dog.
 */

package com.practice.basic1;

import java.util.Scanner;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String sentence = scanner.nextLine();
        StringBuilder upperCaseLine = new StringBuilder();
        Scanner lineScan = new Scanner(sentence);
        while (lineScan.hasNext()){
            String word = lineScan.next();
            upperCaseLine.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        System.out.println(upperCaseLine.toString().trim());
    }

}
