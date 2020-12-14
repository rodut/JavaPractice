package com.collectionexercises.treeset;

import java.util.TreeSet;

public class Q5 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Blue");
        treeSet.add("Green");

        // getting the first and the last elements of the tree set
        Object firstElement = treeSet.first();
        Object lastElement = treeSet.last();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
    }
}
