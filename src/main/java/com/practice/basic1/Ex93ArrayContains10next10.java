/**
 * Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20, but not both.
 */

package com.practice.basic1;

import java.util.Arrays;
import java.util.List;

public class Ex93ArrayContains10next10 {
    public static void main(String[] args) {

        int[] myArray = {10, 10, 0, 20, 20};

        boolean found1010 = false;
        boolean found2020 = false;

        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] == 10 && myArray[i + 1] == 10)
                found1010 = true;

            if (myArray[i] == 20 && myArray[i + 1] == 20)
                found2020 = true;
        }
        System.out.println(found1010 != found2020);
    }
}
