/**
 * Write a Java program to update specific array element by given element.
 */
package com.collectionexercises.arraylist;

import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Doe");
        list.add("Bob");

        list.set(2, "Robert");
        System.out.println(list);
    }
}
