/**
 * Write a Java program to print the odd numbers from 1 to 99. Prints one number per line.
 */

package com.practice.basic1;

public class PrintOddNumbers {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }
}
