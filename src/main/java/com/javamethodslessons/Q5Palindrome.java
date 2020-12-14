/**
 * Write a method that takes as input a non-negative integer and returns true if
 * the number is a palindrome; otherwise, it returns false.
 * Also write a program to test your method.
 */

package com.javamethodslessons;

import java.util.Scanner;

public class Q5Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int number = scanner.nextInt();
        if (number > 0) {
            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is NOT a palindrome.");
            }
        } else {
            System.out.println("You've entered a negative number.");
            System.exit(0);
        }
    }

    public static boolean isPalindrome(int number) {
        int temp = number;
        int remainder;
        int reverse = 0;
        while (temp > 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        return number == reverse;
    }
}
