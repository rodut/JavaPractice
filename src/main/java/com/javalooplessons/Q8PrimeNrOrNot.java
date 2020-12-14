/**
 * Write a program that prompts the user to input a positive integer.
 * It should then output a message indicating whether the number is a prime number.
 */

package com.javalooplessons;

import java.util.Scanner;

public class Q8PrimeNrOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int number = scanner.nextInt();
        boolean flag = false;
        if (number > 0) {
            for (int i = 2; i <= number / 2; ++i) {
                if (number % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}
