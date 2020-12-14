/**
 * Write a Java program to test if 10 appears as either the first or last element of an array of integers.
 * The length of the array must be greater than or equal to 2.
 * Sample Output:
 * Test Data: array = 10, -20, 0, 30, 40, 60, 10
 * true
 */

package com.practice.basic1;

public class Ex74 {
    public static void main(String[] args) {

        int[] array = {10, -20, 0, 30, 40, 60, 10};
        int firstNum = array[0];
        int lastNum = array[array.length-1];

        System.out.println(compare(firstNum, lastNum, array));
    }

    private static boolean compare(int x, int y, int[] arr){

//        if(x == 10 && y == 10 && arr.length >=2)
//            return true;
//        else
//            return false;

        /**
         * Simplified version
         */
        return x == 10 && y == 10 && arr.length >= 2;
    }
}
