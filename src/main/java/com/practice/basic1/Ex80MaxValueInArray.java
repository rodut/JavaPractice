/**
 * Write a Java program to get the larger value between first and last element of an array (length 3) of integers.
 * Sample Output:
 * Original Array: [20, 30, 40]
 * Larger value between first and last element: 40
 */

package com.practice.basic1;

import java.util.Arrays;

public class Ex80MaxValueInArray {
    public static void main(String[] args) {

        int[] array = {20, 30, 40};

        if (array[0] > array[2])
            System.out.println("Max value: " + array[0]);
        else
            System.out.println("Max value: " + array[2]);
    }
}
