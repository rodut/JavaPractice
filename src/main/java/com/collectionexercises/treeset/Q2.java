package com.collectionexercises.treeset;

import java.util.TreeSet;

public class Q2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Blue");

        // iterate through all elements of the tree set
        System.out.println("TreeSet elements are: ");
        for (String e: treeSet
             ) {
            System.out.println(e);
        }
    }
}
