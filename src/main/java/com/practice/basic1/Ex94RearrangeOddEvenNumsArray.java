/**
 * Write a Java program to rearrange all the elements of an given array of integers so that all the odd numbers come before all the even numbers.
 */

package com.practice.basic1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Ex94RearrangeOddEvenNumsArray {
    public static void main(String[] args) {

        int[] myArray = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};

        int i = 0;
        while (i < myArray.length && myArray[i] % 2 == 0)
            i++;
        for (int j = i + 1; j < myArray.length; j++) {
            if (myArray[j] % 2 != 0) {
                int temp = myArray[i];
                myArray[i] = myArray[j];
                myArray[j] = temp;
                i++;

            }
        }
        System.out.println("New array: " + Arrays.toString(myArray));
    }
}
