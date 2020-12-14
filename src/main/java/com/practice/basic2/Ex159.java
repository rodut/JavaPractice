/**
 *  Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.
 * Expected Output:
 * Original Array:
 * [1, 4, 17, 7, 25, 3, 100]
 * 3 largest elements of the said array are:
 * 100 25 17
 */

package com.practice.basic2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Ex159 {
    public static void main(String[] args) {

        Integer[] array = {1, 4, 17, 7, 25, 3, 100};

//        int k = getRandomNumber(array.length);
        int randomNumber = getRandomNumberInRange(1, array.length);

        System.out.println("Original array: ");
        System.out.println(Arrays.toString(array));
        System.out.println(randomNumber + " largest element(s) in the array are: ");

        /**  Sorting elements in descending order, from the highest to lowest */
        Arrays.sort(array, Collections.reverseOrder());

        for (int i = 0; i < randomNumber; i++) {
            System.out.print(array[i] + " ");
        }
    }
    private static int getRandomNumber(int max) {
        return (int) ((Math.random() * (max - 1)) + 1);
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Max must be greater than min!");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
