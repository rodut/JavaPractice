/**
 * Write a Java program that accepts two integer values between 25 to 75
 * and return true if there is a common digit in both numbers
 * Sample Output:
 * Input the first number: 35
 * Input the second number: 45
 * Result: true
 */

package com.practice.basic1;

import java.util.Scanner;

public class Ex64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Result: " + count(firstNumber, secondNumber));

    }

    public static boolean count(int num1, int num2) {
        if (num1 < 25 || num2 > 75)
            return false;
        int x = num1 % 10;
        int y = num2 % 10;
        num1 /= 10;
        num2 /= 10;
        return (num1 == num2 || num1 == y || x == num2 || x == y);
    }

}
