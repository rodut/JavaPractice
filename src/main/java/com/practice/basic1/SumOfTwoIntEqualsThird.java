/**
 * Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
 * Sample Output:
 * Input the first number : 5
 * Input the second number: 10
 * Input the third number : 15
 * The result is: true
 */

package com.practice.basic1;

import java.util.Scanner;

public class SumOfTwoIntEqualsThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Input the third number: ");
        int thirdNumber = scanner.nextInt();
        System.out.println("The result is: " + calculate(firstNumber, thirdNumber, secondNumber));
    }

    private static boolean calculate(int p, int q, int r) {

        /**
         *  If we will exclude the place of the numbers: firstNumber, thirdNumber, secondNumber,  we will use this form.
         *  If we will include in calculate() method the correct place of numbers: firstNumber, secondNumber, thirdNumber
         *  we can use the second form:
         *  return ((p + q) == r);
         */
        return ((p + q) == r || (q + r) == p || (p + r) == q);
    }
}
