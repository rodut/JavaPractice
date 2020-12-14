/**
 * Write a Java program to search an element in a array list
 */

package com.collectionexercises.arraylist;

import java.util.ArrayList;

public class Q7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Doe");
        list.add("Bob");

        System.out.println(list.contains("Bob"));
    }
}
