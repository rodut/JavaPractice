/**
 * Write a Java program to print all the elements of a ArrayList using the position of the elements
 */

package com.collectionexercises.arraylist;

import java.util.ArrayList;

public class Q22 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Doe");
        list.add("Bob");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " have index: " + i);
        }

    }
}
