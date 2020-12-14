/**
 * Write a menu driven Java program with following option
 * a. Accept elements of an array
 * b. Display elements of an array
 * c. Search the element within array given by user
 * d. Sort the array using bubble sort method
 * Write methods for all options.
 * The methods should be static and have one parameter name of the array.
 */

package com.javaarralessons;

import java.util.Scanner;

public class Q7 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size;
        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();
        int[] list = new int[size];

        int option;
        do {
            System.out.println("Menu ");
            System.out.println("1. Read array");
            System.out.println("2. Display array");
            System.out.println("3. Search an item in array");
            System.out.println("4. Sort the array");
            System.out.println("5. Exit");
            System.out.println("Select an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    readArray(list);
                    break;
                case 2:
                    displayArray(list);
                    break;
                case 3:
                    System.out.print("Enter the number you want to search: ");
                    int item = scanner.nextInt();
                    int index = searchArray(list, item);
                    if (index == -1) {
                        System.out.println("Item not found");
                    } else {
                        System.out.println("Item was found at position " + (index + 1));
                    }
                    break;
                case 4:
                    System.out.println("Sorted array: ");
                    sortArray(list);
                    displayArray(list);
                    break;

            }
        } while (option != 5);
    }

    public static void readArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int searchArray(int[] array, int data) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
