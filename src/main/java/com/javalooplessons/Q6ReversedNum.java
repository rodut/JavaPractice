/**
 * Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
 * For example, if the input is 12345, the output should be 54321.
 */

package com.javalooplessons;

import java.util.Scanner;

public class Q6ReversedNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number /= 10;
        }
        System.out.println("Reversed number is: " + reverse);
    }
}
