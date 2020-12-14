/**
 * Write a Java program to divide the two given integers using subtraction operator.
 * Expected Output:
 * Input the dividend: 625
 * Input the divider: 25
 * Result: 25.0
 */

package com.practice.basic2;

import java.util.Scanner;

public class Ex164 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("Input the divider: ");
        int divider = scanner.nextInt();

        System.out.println("Result: " + divide(dividend, divider));
        System.out.println("Result(second solution):" + divideUsingSubtraction(dividend, divider));
    }

    private static int divide(int dividend, int divider) {

        if (divider == 0) {
            return 0;
        }

        /**
         * Calculate sign of divisor i.e., sign will be negative only iff
         * either one of them is negative otherwise it will be positive
         */
        int sign = ((dividend < 0) ^ (divider < 0)) ? -1 : 1;

        /**  Update both divisor and dividend positive */
        dividend = Math.abs(dividend);
        divider = Math.abs(divider);

        /**  Initialize the quotient */
        int quotient = 0;
        while (dividend >= divider) {
            dividend -= divider;
            ++quotient;
        }
        return sign * quotient;
    }

    /**
     * We can solve it another way - the second solution
     */
    private static float divideUsingSubtraction(int dividend, int divider) {
        if (divider == 0) {
            return 0;
        }
        float result = 0;
        while (dividend > divider) {
            dividend -= divider;
            result++;
        }
        float decimalPart = (float) dividend / (float) divider;
        result += decimalPart;
        return result;
    }
}
