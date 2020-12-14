/**
 * A palindrome is a word, number or other sequence of characters which reads
 * the same backward as forward, such as madam, racecar...
 */

package com.practice.basic1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String initStr = scanner.nextLine();
        StringBuilder finalStr = new StringBuilder();
        finalStr = finalStr.append(initStr).reverse();
        if(initStr.contentEquals(finalStr))
            System.out.println("The word " + initStr + " is a palindrome.");
        else
            System.out.println("The word you entered is not a palindrome.");
    }
}
