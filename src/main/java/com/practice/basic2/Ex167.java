/**
 * Write a Java program to move every zero to the right side of a given array of integers.
 * Original array: [0, 3, 4, 0, 1, 2, 5, 0]
 * Result: [3, 4, 1, 2, 5, 0, 0, 0]
 */

package com.practice.basic2;

import java.util.Arrays;

public class Ex167 {
    public static void main(String[] args) {

        int[] numbers = {0, 3, 4, 0, 1, 2, 5, 0};
        System.out.println("Original array: " + Arrays.toString(numbers));
        int[] result = splitArray(numbers);
        System.out.println("");
        System.out.println("Result: " + Arrays.toString(result));

    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }

    private static int[] splitArray(int[] arr) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == 0 && arr[i + 1] != 0) {
                    swap(arr, i, i + 1);
                    flag = true;
                }
            }
        }
        return arr;
    }
}
