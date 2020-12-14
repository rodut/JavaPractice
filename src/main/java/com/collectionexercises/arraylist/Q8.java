/**
 * Write a Java program to sort a given array list
 */
package com.collectionexercises.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Q8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Doe");
        list.add("Bob");

        System.out.println("The list before sorting: " + list);
        Collections.sort(list);
        System.out.println("The list after sorting: " + list);
    }
}
