/**
 * Write a Java program to find the numbers greater than the average of the numbers of a given array.
 * Expected Output:
 * Original Array:
 * [1, 4, 17, 7, 25, 3, 100]
 * The average of the said array is: 22.0
 * The numbers in the said array that are greater than the average are:
 * 25
 * 100
 */

package com.practice.basic2;

import java.util.Arrays;

public class Ex162 {
    public static void main(String[] args) {

        int[] myArray = {1, 4, 17, 7, 25, 3, 100};
        System.out.println("Original array: ");
        System.out.println(Arrays.toString(myArray));

        /**  Calculate the total value of ints in the array */
        double total = 0;
        for (int value : myArray) {
            total = total + value;
        }

        /**  Calculate the average in the array */
        double average = total / myArray.length;
        System.out.println("The average of the array is: " + average);

        /**  Print the numbers that are greater than the average in the array */
        System.out.println("The numbers in the array that are greater than the average are: ");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > average)
                System.out.println(myArray[i]);
        }
    }
}
