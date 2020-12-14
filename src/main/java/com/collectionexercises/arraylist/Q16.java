/**
 * Write a Java program to clone an array list to another array list.
 */

package com.collectionexercises.arraylist;

import java.util.ArrayList;

public class Q16 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Jack");
        list1.add("Doe");
        list1.add("Bob");

        // Clone list1 to list2
        ArrayList<String> list2 = (ArrayList<String>)list1.clone();
        System.out.println("Cloned list: " + list2);

    }
}
