package com.javalessons.collections.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLauncher {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /**  Objects can be kept in arrays.
         *   We need to specify the size of our array.
         *   We can access each of arrays elements by it's index (index starts with 0).
         *   Initializing an array.
         */
        int[] myArray = new int[10];
        myArray[0] = 0;
        myArray[1] = 100;
        myArray[2] = 200;
        myArray[3] = 300;
        myArray[4] = 400;
        myArray[5] = 500;
        myArray[6] = 600;
        myArray[7] = 700;
        myArray[8] = 800;
        myArray[9] = 900;
        System.out.println("Element 4 = " + myArray[4]);

        /**  Another way to initialize an array */
        int[] myNewArray = new int[8];


        /**  Printing all the elements of an array */
        System.out.println("Enter 8 integers.");
        for (int j = 0; j < myNewArray.length; j++) {
            System.out.println("Next element: ");
            myNewArray[j] = scanner.nextInt();
        }
        System.out.println("\n");

        /**  Calling the sort() method */
        int[] array = sort(myNewArray);

        for (int i = 0; i < myNewArray.length; i++) {
            System.out.println("Element #" + i + " = " + myNewArray[i]);
        }
    }

    private static void copyArrays(int[] array) {
        /**  Copy the elements from one array into another */
        int[] myNewArray = Arrays.copyOf(array, array.length);
    }

    /**
     * Sorting array elements
     */
    private static int[] sort(int[] array) {

        /**  Sort from the smallest one to the biggest one */
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }


}
