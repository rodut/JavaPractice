/**
 * Write a Java program to test if the first and the last element of an array of integers are same.
 * The length of the array must be greater than or equal to 2.
 * Test Data: array = 50, -20, 0, 30, 40, 60, 10
 * Sample Output:
 * false
 */

package com.practice.basic1;

public class Ex75FirstLastArrayElemsEquals {
    public static void main(String[] args) {

        int[] array = {50, -20, 0, 30, 40, 60, 10};

        int firstElem = array[0];
        int lastElem = array[array.length - 1];

        System.out.println(compare(firstElem, lastElem, array));

    }

    private static boolean compare(int x, int y, int[] arr) {
        return x == y && arr.length >= 2;
    }
}
