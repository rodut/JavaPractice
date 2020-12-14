package com.collectionexercises.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Q4 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Blue");
        treeSet.add("Green");

        System.out.println("Initial TreeSet: " + treeSet);

        // TreeSet is printed in reverse (descending) order
        System.out.println("The reverse order of the TreeSet: " + treeSet.descendingSet());

        // another method to print elements in descending order
        Iterator iterator = treeSet.descendingIterator();
        System.out.println("Elements in reverse order: ");
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
