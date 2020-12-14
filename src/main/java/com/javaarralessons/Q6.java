/**
 * Write a Java program to find the largest and smallest element of an array.
 */

package com.javaarralessons;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
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

        System.out.println("The largest element in the array is: " + getLargestElement(list, size));
        System.out.println("The smallest element in the array is: " + getSmallestElement(list));
    }

    public static int getLargestElement(int[] a, int total){
        Arrays.sort(a);
        return a[total-1];
    }

    public static int getSmallestElement(int[] a){
        Arrays.sort(a);
        return a[0];
    }
}
