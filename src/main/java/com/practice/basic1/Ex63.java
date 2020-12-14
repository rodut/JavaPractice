/**
 * Write a Java program that accepts two integer values from the user and return the larger values.
 * However if the two values are the same, return 0 and return the smaller value if the two values have the same remainder when divided by 6.
 * Sample Output:
 * Input the first number: 12
 * Input the second number: 13
 * Result: 13
 */

package com.practice.basic1;

import java.util.Scanner;

public class Ex63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Result: " + count(firstNumber, secondNumber));

    }

    //  No idea if it's correct!
//    public static int count(int num1, int num2) {
//        if (num1 > num2) {
//            return num1;
//        } else if (num2 > num1) {
//            return num2;
//        } else if (num1 == num2) {
//            return 0;
//        } else if (num1 % 6 == num2 % 6) {
//            return Math.min(num1, num2);
//        }
//        return 1000;
//    }

    public static int count(int num1, int num2) {
        if (num1 == num2)
            return 0;
        if (num1 % 6 == num2 % 6)
            return Math.min(num1, num2);
        return Math.max(num1, num2);

    }
}
