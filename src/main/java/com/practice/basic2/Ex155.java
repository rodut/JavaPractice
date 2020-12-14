/**
 * Write a Java program to print an array after changing the rows and columns of a given two-dimensional array.
 * Original Array:
 * 10 20 30
 * 40 50 60
 * After changing the rows and columns of the said array:
 * 10 40
 * 20 50
 * 30 60
 */

package com.practice.basic2;

import java.util.Arrays;

public class Ex155 {
    public static void main(String[] args) {

        int[][] array = {
                {10, 20, 30},
                {40, 50, 60}
        };

        System.out.print("Original Array:\n");
        printArray(array);

        System.out.print("After changing the rows and columns of the said array:");
        transposeArray(array);
    }

    private static void transposeArray(int[][] array) {

        int[][] newArray = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                newArray[j][i] = array[i][j];
            }
        }
        printArray(newArray);
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
