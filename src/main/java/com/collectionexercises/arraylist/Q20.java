/**
 * Write a Java program to increase the size of an array list
 */

package com.collectionexercises.arraylist;

import java.util.ArrayList;

public class Q20 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Doe");
        list.add("Bob");

        System.out.println("The capacity of the list is: " + list.size());
        list.ensureCapacity(10);
        System.out.println("The new capacity of the list is: " + list.size());
    }
}
