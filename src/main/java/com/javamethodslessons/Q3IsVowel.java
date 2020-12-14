/**
 * Write a value-returning method, isVowel that returns the value true if a given character is a vowel, and otherwise returns false.
 * In main() method accept a string from user and count number of vowels in that string.
 */

package com.javamethodslessons;

import java.util.Scanner;

public class Q3IsVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the string: ");
        String string = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (isVowel(string.charAt(i))) {
                count++;
            }
        }
        System.out.println("The number of vowels is: " + count);
    }

    public static boolean isVowel(char letter) {
        switch (letter) {
            case 'a':
            case 'A':
            case 'o':
            case 'O':
            case 'e':
            case 'E':
            case 'I':
            case 'i':
            case 'U':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
