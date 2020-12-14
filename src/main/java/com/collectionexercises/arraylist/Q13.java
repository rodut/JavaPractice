/**
 * Write a Java program to compare two array lists
 */

package com.collectionexercises.arraylist;

import java.util.ArrayList;

public class Q13 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Doe");
        list.add("Bob");

        ArrayList<String> newList = new ArrayList<>();
        newList.add("Jack");
        newList.add("Bob");
        newList.add("Doe");

//        System.out.println(list.equals(newList));;

        // Another method to compare lists, ignoring indexes
        ArrayList<String> lastList = new ArrayList<>();
        for (String element : list)
            lastList.add(newList.contains(element) ? "Yes" : "No");
        System.out.println(lastList);
    }
}
