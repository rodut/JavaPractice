/**
 * Write a program with a method named getTotal that accepts two integers as an argument and return its sum.
 * Call this method from main( ) and print the results.
 */

package com.javamethodslessons;

import java.util.Scanner;

public class Q1MethodTwoInts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input the second number: ");
        int secondNumber = scanner.nextInt();

        //System.out.println("The result is: " + getTotal(firstNumber, secondNumber));

        // or we can do another way
        int sum = getTotal(firstNumber, secondNumber);
        System.out.println("The result is: " + sum);
    }

    public static int getTotal(int x, int y) {
        return x + y;
    }
}
