/**
 * Write a Java program to remove the third element from a array list
 */

package com.collectionexercises.arraylist;

import java.util.ArrayList;

public class Q6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Doe");
        list.add("Bob");

        list.remove(2);
        System.out.println(list);
    }
}
