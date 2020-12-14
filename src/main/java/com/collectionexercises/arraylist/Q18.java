/**
 * Write a Java program to test an array list is empty or not
 */

package com.collectionexercises.arraylist;

import java.util.ArrayList;

public class Q18 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Doe");
        list.add("Bob");

        System.out.println(list.isEmpty());

        list.removeAll(list);
        System.out.println(list.isEmpty());
    }
}
