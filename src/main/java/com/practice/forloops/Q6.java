/**
 * Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
 * For example, if the input is 12345, the output should be 54321.
 */

package com.practice.forloops;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int number = scanner.nextInt();
        int reverseNumber = 0;

        for (; number != 0; ) {
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + number % 10;
            number = number / 10;
        }
        System.out.println("Reverse number is: " + reverseNumber);
    }
}
