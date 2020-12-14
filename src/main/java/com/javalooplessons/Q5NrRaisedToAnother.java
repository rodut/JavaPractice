/**
 * Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.
 * (Do not use Java built-in method).
 */

package com.javalooplessons;

import java.util.Scanner;

public class Q5NrRaisedToAnother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();
        int result = 1;

        if (number >= 0 && power == 0) {
            result = 1;
        } else if (number == 0 && power >= 1) {
            result = 0;
        } else {
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
        }
        System.out.println("The result is: " + result);
    }
}
