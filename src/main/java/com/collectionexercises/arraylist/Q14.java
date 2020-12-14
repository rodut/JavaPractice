/**
 * Write a Java program of swap two elements in an array list
 */

package com.collectionexercises.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Q14 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Doe");
        list.add("Bob");

        Collections.swap(list, 2, 1);
        System.out.println("Swapped list: " + list);
    }
}
