/**
 * Write a Java program to multiply corresponding elements of two arrays of integers.
 * Sample Output:
 * Array1: [1, 3, -5, 4]
 * Array2: [1, 4, -5, -2]
 * Result: 1 12 25 -8
 */

package com.practice.basic1;

import java.util.Arrays;

public class Ex83MultiplyArrayElements {
    public static void main(String[] args) {

        String result = "";
        int[] firstArray = {1, 3, -5, 4};
        int[] secondArray = {1, 4, -5, -2};

        int firstMultiply = firstArray[0] * secondArray[0];
        int secondMultiply = firstArray[1] * secondArray[1];
        int thirdMultiply = firstArray[2] * secondArray[2];
        int fourthMultiply = firstArray[3] * secondArray[3];

        int[] newArray = {firstMultiply, secondMultiply, thirdMultiply, fourthMultiply};
        System.out.println("Result: " + Arrays.toString(newArray));
        System.out.println("Result: " + firstMultiply + " " + secondMultiply + " " + thirdMultiply + " " + fourthMultiply);

        /**  A better way to solve the problem */
        for (int i = 0; i < firstArray.length ; i++) {
            int num1 = firstArray[i];
            int num2 = secondArray[i];
            result += num1 * num2 + " ";
        }
        System.out.println("Result: " + result);
    }
}
