/**
 * Write a Java program to create a new array of length 2 from two arrays of integers with three
 * elements and the new array will contain the first and last elements from the two arrays.
 * Test Data: array1 = 50, -20, 0
 * array2 = 5, -50, 10
 * Sample Output:
 * Array1: [50, -20, 0]
 * Array2: [5, -50, 10]
 * New Array: [50, 10]
 */

package com.practice.basic1;

import java.util.Arrays;

public class Ex77NewArrayFrom2Arrays {
    public static void main(String[] args) {

        int[] firstArray = {50, -20, 0};
        int[] secondArray = {5, -50, 10};

        int[] newArray = {firstArray[0], secondArray[secondArray.length -1]};

        /**
         * If we will print only the ("message" + newArray) we will get an address to the memory,
         * that why we need to use: Arrays.toString(newArray)!!!
         */
        System.out.println("New array: " + Arrays.toString(newArray));
    }
}
