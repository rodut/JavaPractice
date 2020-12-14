/**
 * Write a Java program to multiply two given integers without using the multiply operator(*).
 * Input the first number: 25
 * Input the second number: 5
 * Result: 125
 */

package com.practice.basic2;

import java.util.Scanner;

public class Ex168 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input the second number: ");
        int secondNumber = scanner.nextInt();
        scanner.close();

        System.out.println("Result: " + multiply(firstNumber, secondNumber));

        System.out.println("Result with recursion: " + multiply2(firstNumber, secondNumber));

        System.out.println("Result with loop: " + multiplyLoop(firstNumber, secondNumber));

        System.out.println("Result with recursion: " + multiplyRecursion(firstNumber, secondNumber));

        System.out.println("Result with Log10: " + multiplyLog10(firstNumber, secondNumber));

        System.out.println("Result divide by inverse: " + multiplyDivideByInverse(firstNumber, secondNumber));

    }

    private static int multiply(int x, int y) {
        int smaller = Math.min(x, y);
        int bigger = Math.max(x, y);

        if (smaller == 0) {
            return 0;
        } else if (smaller == 1) {
            return bigger;
        }

        int s = smaller >> 1;
        int halfProd = multiply(s, bigger);

        if (smaller % 2 == 0) {
            return halfProd + halfProd;
        } else {
            return halfProd + halfProd + bigger;
        }
    }

    /**
     * Using recursion
     */
    private static int multiply2(int n, int m, int val) {
        if (m <= 0) return val;
        return multiply2(n, m - 1, val + n);
    }

    private static int multiply2(int n, int m) {
        if (m > n) {
            int temp = n;
            n = m;
            m = temp;
        }
        return multiply2(n, m, 0);
    }

    private static int multiplyLoop(int a, int b) {
        int result = 0;
        for (int i = 0; i < a; i++) {
            result += b;
        }
        return result;
    }

    private static int multiplyRecursion(int a, int b) {
        if ((a == 0) || (b == 0))
            return 0;
        else
            return (a + multiplyRecursion(a, b - 1));
    }

    private static int multiplyLog10(int a, int b) {
        return (int) Math.pow(10, (Math.log10(a) + Math.log10(b)));
    }

    private static double multiplyDivideByInverse(double a, double b) {
        return 0 == b ? 0 : a / (1 / b);
    }
}
