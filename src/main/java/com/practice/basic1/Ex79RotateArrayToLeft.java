/**
 * Write a Java program to rotate an array (length 3) of integers in left direction.
 * Sample Output:
 * Original Array: [20, 30, 40]
 * Rotated Array: [30, 40, 20]
 */

package com.practice.basic1;

import java.util.Arrays;

public class Ex79RotateArrayToLeft {
    public static void main(String[] args) {

        int[] originalArray = {20, 30, 40};
        System.out.println("Original array: " + Arrays.toString(originalArray));
        int[] rotatedArray = {originalArray[1], originalArray[2], originalArray[0]};
        System.out.println("Rotated array: " + Arrays.toString(rotatedArray));
    }
}
