/**
 * Write a Java program to partition an given array of integers into even number first and odd number second.
 * Expected Output
 * Original array: [7, 2, 4, 1, 3, 5, 6, 8, 2, 10]
 * After partition the said array becomes: [10, 2, 4, 2, 8, 6, 5, 3, 1, 7]
 */

package com.practice.basic2;

import java.util.Arrays;

public class Ex176 {
    public static void main(String[] args) {

        int[] numbers = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};

        int[] result = partition(numbers);
        System.out.println("Result: " + Arrays.toString(result));
    }

    private static int[] partition(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            while (arr[i] % 2 == 0) i++;
            while (arr[j] % 2 != 0) j--;
            if (i < j) {
                swap(arr, i, j);
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }
}
