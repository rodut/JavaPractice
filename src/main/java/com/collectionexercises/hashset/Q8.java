package com.collectionexercises.hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q8 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Jack");
        hashSet.add("Bob");

        //converting the hash set into a tree set
        Set<String> treeSet = new TreeSet<>(hashSet);

        // displaying the element of the tree set
        for (String e: treeSet
             ) {
            System.out.println(e);
        }
    }
}
