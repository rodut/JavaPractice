/**
 * Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.
 * Sample Output:
 * Input first number: 5
 * Input second number: 1
 * false
 */

package com.practice.basic2;

import java.util.Scanner;

public class Ex153 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Input second number: ");
        double secondNumber = scanner.nextDouble();

        if (firstNumber > 0 && firstNumber < 1 && secondNumber > 0 && secondNumber < 1)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
