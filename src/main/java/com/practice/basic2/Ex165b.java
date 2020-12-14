/**
 * Write a Java program to move every positive number to the right and every negative number to the left of a given array of integers.
 */

package com.practice.basic2;

import java.util.Arrays;

public class Ex165b {
    public static void main(String[] args) {

        int[] numbers = {-2, 3, 4, -1, -3, 1, 2, -4, 0};
        System.out.print("Original array: " + Arrays.toString(numbers));
        int[] result = splitSortingArray(numbers);
        System.out.println("");
        System.out.print("Result: " + Arrays.toString(result));
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }

    private static int[] splitSortingArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Null array!");
        }
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    flag = true;
                }
            }
        }
        return arr;
    }
}
