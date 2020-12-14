/**
 * Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise.
 * Sample Output:
 * Input first number: 25
 * Input second number: 37
 * Input third number: 45
 * Input fourth number: 23
 * Numbers are not equal!
 */

package com.practice.basic2;

import java.util.Scanner;

public class Ex152 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Input third number: ");
        int thirdNumber = scanner.nextInt();
        System.out.print("Input fourth number: ");
        int fourthNumber = scanner.nextInt();

        if(firstNumber == secondNumber && secondNumber == thirdNumber && firstNumber == fourthNumber)
            System.out.println("Numbers are equal.");
        else
            System.out.println("Numbers are not equal.");
    }
}
