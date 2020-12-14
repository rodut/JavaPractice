/**
 * Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */
package com.practice.basic1;

import java.util.Scanner;

public class NumbersAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        float firstNumber = in.nextFloat();
        System.out.println("Input the second number: ");
        float secondNumber = in.nextFloat();
        System.out.println("Input the third number: ");
        float thirdNumber = in.nextFloat();

        float result = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("The average of the numbers is: " + result);
    }
}
