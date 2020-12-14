package com.collectionexercises.hashset;

import java.util.HashSet;

public class Q11 {
    public static void main(String[] args) {
        HashSet<String> firstHashSet = new HashSet<>();
        firstHashSet.add("1");
        firstHashSet.add("2");
        firstHashSet.add("3");

        HashSet<String> secondHashSet = new HashSet<>();
        secondHashSet.add("1");
        secondHashSet.add("2");
        secondHashSet.add("4");

        // comparing two hash sets
        if(firstHashSet.contains(secondHashSet))
            System.out.println("Hash sets are equals.");
        else
            System.out.println("Hash sets are NOT equals.");

        // retain elements which are the same in both hash sets
        firstHashSet.retainAll(secondHashSet);
        System.out.println("The element that are in both hash sets are: " + firstHashSet);
    }
}
