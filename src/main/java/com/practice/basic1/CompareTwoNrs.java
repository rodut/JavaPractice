/**
 * Write a Java program to compare two numbers.
 * Input Data:
 * Input first integer: 25
 * Input second integer: 39
 * Expected Output:
 * 25 != 39
 * 25 < 39
 * 25 <= 39
 */

package com.practice.basic1;

import java.util.Scanner;

public class CompareTwoNrs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber != secondNumber)
//            System.out.println(firstNumber + " != " + secondNumber);
            System.out.printf("%d != %d\n", firstNumber, secondNumber);
        if (firstNumber < secondNumber)
            System.out.println(firstNumber + " < " + secondNumber);
        if (firstNumber <= secondNumber)
            System.out.println(firstNumber + " <= " + secondNumber);
        if (firstNumber > secondNumber)
            System.out.println(firstNumber + " > " + secondNumber);
        if (firstNumber == secondNumber)
            System.out.println(firstNumber + " = " + secondNumber);
        if (firstNumber >= secondNumber)
            System.out.println(firstNumber + " >= " + secondNumber);
    }
}

