/**
 * Write a program to calculate the sum of first 10 natural numbers.
 */

package com.javalooplessons;

public class Q2CalcSum10Num {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i; // sum = sum + i;
        }

        System.out.println("The sum of first 10 natural numbers is: " + sum);
    }
}

