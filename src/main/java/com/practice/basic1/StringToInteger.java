/**
 * Write a Java program to convert a string to an integer in Java.
 * Sample Output:
 * Input a number(string): 25
 * The integer value is: 25
 */

package com.practice.basic1;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number (string): ");
        String number = scanner.nextLine();
        int result = Integer.parseInt(number);
        System.out.println("The integer value is: "+ result);
    }
}
