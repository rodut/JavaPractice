/**
 * Write a Java program to retrieve an element (at a specified index) from a given array list.
 */

package com.collectionexercises.arraylist;

import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("White");
        list.add("Black");
        list.add("Grey");

        // Retrieve an element at a specific index from array list
        System.out.println("Third element of the list is: " + list.get(2));

        // We can do it in another way
        String element = list.get(2);
        System.out.println("Third element of the list is: " + element);
    }
}
