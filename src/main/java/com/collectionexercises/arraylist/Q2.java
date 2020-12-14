/**
 * Write a Java program to iterate through all elements in a array list
 */

package com.collectionexercises.arraylist;

import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        // Creating an array list
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the array list
        list.add("White");
        list.add("Black");
        list.add("Grey");

        for (String element : list) {
            System.out.println(element);
        }
    }
}
