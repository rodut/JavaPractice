/**
 * The variable list1 and list2 are reference arrays that each have 5 elements.
 * Write code that copies the values in list1 to list2.
 * Values in list1 are input by user.
 */

package com.javaarralessons;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        final int SIZE = 5;
        int[] list1 = new int[SIZE];
        int[] list2 = new int[list1.length];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + SIZE + " elements: ");

        // Get the numbers from the user
        for (int i = 0; i < SIZE; i++) {
            list1[i] = scanner.nextInt();
        }

        // Copy elements in list2.
        for (int i = 0; i < list1.length; i++) {
            list2[i] = list1[i];
        }

        // Display elements in list2
        System.out.println("Element of list2 are: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.println(list2[i]);
        }
    }
}
