package com.collectionexercises.treeset;

import java.util.TreeSet;

public class Q3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Blue");

        TreeSet<String> secondTreeSet = new TreeSet<>();
        secondTreeSet.add("Orange");
        secondTreeSet.add("Black");

        // adding all element from the secondTreeSet to treeSet
        treeSet.addAll(secondTreeSet);
        System.out.println("The new TreeSet is: " + treeSet);
    }
}
