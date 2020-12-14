/**
 * Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
 * Sample Output:
 * Input the first number: 19
 * Input the second number: 7
 * Result: 5
 */

package com.practice.basic1;

import java.util.Scanner;

public class Ex65ModulesTwoNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input the second number: ");
        int secondNumber = scanner.nextInt();

        int divided = firstNumber / secondNumber;
        int result = firstNumber - (divided * secondNumber);
        System.out.println("Divided: " + divided);
        System.out.println("Result: " + result);
    }
}
