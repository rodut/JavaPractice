/**
 * Write a Java program to accept a positive number and repeatedly add all its digits until the result has only one digit.
 * Expected Output:
 * Input a positive integer:  25
 * 7
 */

package com.practice.basic2;

import javafx.scene.shape.SVGPath;

import java.util.Scanner;

public class Ex183 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int n = scanner.nextInt();
        if (n > 0)
            System.out.println(addDigitsUntilOne(n));
    }

    private static int addDigitsUntilOne(int n) {
        while (n > 9) {
            int sum = 0;
            while (n != 0) {
                sum += n % 10; // sum = sum + n % 10;
                n /= 10; //  n = n / 10;

            }
            n = sum;
        }
        return n;
    }
}
