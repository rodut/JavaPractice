/**
 * Write a Java program to create a new array list, add some colors (string) and print out the collection.
 */

package com.collectionexercises.arraylist;

import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {

        // Creating an array list
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the array list
        list.add("White");
        list.add("Black");
        list.add("Grey");

        // Display the array list
        System.out.println("The array list contains: " + list);

    }
}
