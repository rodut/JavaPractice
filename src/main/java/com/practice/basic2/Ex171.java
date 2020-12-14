/**
 * Write a Java program to accept two string and test if the second string contains the first one.
 * Input first string: Once in a blue moon
 * Input second string: See eye to eye
 * If the second string contains the first one? false
 */

package com.practice.basic2;

import java.util.Scanner;

public class Ex171 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Input second string: ");
        String secondString = scanner.nextLine();

        System.out.println("If the second string contains the first one? " + compareStrings(firstString, secondString));
    }

    private static boolean compareStrings(String firstString, String secondString) {
        return firstString.contains(secondString);


    }
}
