/**
 * Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
 * Sample Output:
 * Input number: 5
 * 5 + 55  + 555
 */
package com.practice.basic1;

import java.util.Scanner;

public class ValueOfNNN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        String number = scanner.nextLine();
        String secondNumber = number + number;
        String thirdNumber = secondNumber + number;

        System.out.println("Result: " + number + " + " + secondNumber + " + " + thirdNumber);

    }
}
