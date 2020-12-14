/**
 * Write a Java program to reverse the element of an integer 1-D array
 */

package com.javaarralessons;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] list = new int[size];

        System.out.println("Enter " + list.length + " integers: ");

        //Input the data received from user in array
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }

        // Reversing elements in the array
        for (int i = 0; i < list.length / 2; i++) {
            int temp = list[i];
            list[i] = list[list.length - i - 1];
            list[list.length - i - 1] = temp;
        }

        // Display the reversed array
        System.out.println("Reversed array is: ");
        for (int value : list) {
            System.out.println(value);
        }
    }
}
