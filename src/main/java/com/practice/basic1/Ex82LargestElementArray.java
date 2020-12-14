/**
 * Write a Java program to find the largest element between first, last, and middle values from an array of integers (even length).
 * Sample Output:
 * Original Array: [20, 30, 40, 50, 67]
 * Largest element between first, last, and middle values: 67
 */

package com.practice.basic1;

public class Ex82LargestElementArray {
    public static void main(String[] args) {

        int[] array = {20, 30, 40, 50, 67};
        int firstArray = array[0];
        int lastArray = array[array.length - 1];
        int middleArray = array[array.length / 2];

        if (firstArray >= lastArray)
            System.out.println("Largest element is: " + firstArray);
        else if (lastArray >= middleArray)
            System.out.println("Largest element is: " + lastArray);
        else
            System.out.println("Largest element is: " + middleArray);

        /**  It can we written in another way */
        int maxValue = firstArray;
        if (maxValue <= lastArray)
            maxValue = lastArray;
        if (maxValue <= middleArray)
            maxValue = middleArray;
        System.out.println("Largest element between first, last, and middle values: " + maxValue);


    }
}
