/**
 * Write a Java program to count the number of even and odd elements in a given array of integers.
 */

package com.practice.basic1;

import java.util.Scanner;

public class Ex92OddEvenElementArray {
    public static void main(String[] args) {

//        int[] array = {11, 129, 180, 540, 0, 55, 68};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int numbers = scanner.nextInt();
        int[] array = new int[numbers];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < numbers; i++) {
            array[i] = scanner.nextInt();
        }

        int evenNumbers = 0;
        int oddNumber = 0;

        for (int value : array) {
            if (value % 2 == 0)
                evenNumbers++;
            else
                oddNumber++;
        }
        System.out.println("Number of even elements in array: " + evenNumbers);
        System.out.println("Number of odd elements in array: " + oddNumber);
    }
}
