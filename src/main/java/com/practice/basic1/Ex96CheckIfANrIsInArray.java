/**
 * Write a Java program to check if there is a 10 in a given array of integers with a 20 somewhere later in the array.
 */

package com.practice.basic1;

import com.sun.deploy.util.ArrayUtil;


import java.util.Arrays;
import java.util.List;

public class Ex96CheckIfANrIsInArray {
    public static void main(String[] args) {

        Integer[] myArray = {10, 3, 4, 6, 20};
        List<Integer> list = Arrays.asList(myArray);
        if (list.contains(10))
            System.out.println("The array contains the number 10");

        if (list.contains(20))
            System.out.println("The array contains the number 20");

        if (list.indexOf(10) < list.indexOf(20))
            System.out.println("Number 20 somewhere later in the array");

        System.out.println("********** We can solve it in another way ***********");

        int[] arrayNumbers = {20, 10, 2, 5, 8};
        boolean isPresent = false;
        int result = 0;

        for (int arrayNumber : arrayNumbers) {
            if (arrayNumber == 10)
                isPresent = true;

            if (isPresent && arrayNumber == 20) {
                System.out.println(true);
                result = 1;
            }
        }
        if(result == 0)
        {
            System.out.println(false);
        }
        System.out.println("\n");
    }
}
