/**
 * Write a Java program to copy one array list into another
 */

package com.collectionexercises.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Q9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Doe");
        list.add("Bob");

        ArrayList<String> newList = new ArrayList<>();
        newList.add("1");
        newList.add("2");
        newList.add("3");

        Collections.copy(list, newList);
        System.out.println("List1: " + list);
        System.out.println("List2: " + newList);

    }
}
