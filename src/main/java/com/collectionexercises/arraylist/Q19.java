/**
 * Write a Java program to trim the capacity of an array list the current list size
 */
package com.collectionexercises.arraylist;

import java.util.ArrayList;

public class Q19 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Doe");
        list.add("Bob");

        list.trimToSize();
        System.out.println(list);
    }
}
