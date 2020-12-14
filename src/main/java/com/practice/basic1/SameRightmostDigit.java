/**
 * Write a Java program that accepts three integers from the user and return true if two or more of them (integers) have the same rightmost digit.
 * The integers are non-negative.
 * Sample Output:
 * Input the first number : 5
 * Input the second number: 10
 * Input the third number : 15
 * The result is: true
 */

package com.practice.basic1;

import java.util.Scanner;

public class SameRightmostDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Input the third number: ");
        int thirdNumber = scanner.nextInt();
        System.out.println("The result is: " + calculate(firstNumber, secondNumber, thirdNumber));
    }

    public static boolean calculate(int i, int j, int k){
        return ((j % 10 == k % 10) || (i % 10 == k % 10) || (j % 10 == i % 10));
    }
}
