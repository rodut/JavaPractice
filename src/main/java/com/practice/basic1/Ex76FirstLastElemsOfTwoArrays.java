/**
 * Write a Java program to test if the first and the last elements of two array of integers are same.
 * The length of the array must be greater than or equal to 2.
 * Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
 * array2 = 45, 20, 10, 20, 30, 50, 11
 * Sample Output:
 * false
 */

package com.practice.basic1;

public class Ex76FirstLastElemsOfTwoArrays {
    public static void main(String[] args) {

        int[] firstArray = {50, -20, 0, 30, 40, 60, 12};
        int[] secondArray = {45, 20, 10, 20, 30, 50, 11};

        int firstElemFirstArray = firstArray[0];
        int lastElemFirstArray = firstArray[firstArray.length - 1];
        int firstElemSecondArray = secondArray[0];
        int lastElemSecondArray = secondArray[secondArray.length - 1];

        System.out.println(compare(firstElemFirstArray, lastElemFirstArray, firstElemSecondArray, lastElemSecondArray, firstArray, secondArray));
    }

    private static boolean compare(int x, int y, int z, int w, int[] arr1, int[] arr2) {
        return x == y && y == z && z == w && arr1.length >= 2 && arr2.length >= 2;
    }
}
