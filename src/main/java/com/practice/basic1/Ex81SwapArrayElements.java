/**
 *  Write a Java program to swap the first and last elements of an array (length must be at least 1) and create a new array.
 * Sample Output:
 * Original Array: [20, 30, 40]
 * New array after swaping the first and last elements: [40, 30, 20]
 */

package com.practice.basic1;

import java.util.Arrays;

public class Ex81SwapArrayElements {
    public static void main(String[] args) {

        int[] array = {20, 30, 40};
        int[] newArray = {array[2], array[1], array[0]};
        System.out.println("New array: " + Arrays.toString(newArray));

        /**  We can write it in another way, a more correct one */
        int x = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = x;
        System.out.println("New array after swapping the first and last elements: "+Arrays.toString(array));
    }
}
