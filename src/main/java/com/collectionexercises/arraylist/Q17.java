/**
 * Write a Java program to empty an array list
 */

package com.collectionexercises.arraylist;

import java.util.ArrayList;

public class Q17 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Jack");
        list1.add("Doe");
        list1.add("Bob");

//        list1.clear();
        list1.removeAll(list1);
        System.out.println(list1);
    }
}
