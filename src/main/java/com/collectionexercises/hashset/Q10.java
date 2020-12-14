package com.collectionexercises.hashset;

import java.util.HashSet;

public class Q10 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Jack");
        hashSet.add("Bob");

        // creating the second hash set
        HashSet<String> newHashSet = new HashSet<>();
        newHashSet.add("Jack");
        newHashSet.add("Bob");

        // comparing two hash sets
        if(hashSet.equals(newHashSet))
            System.out.println("Hash sets are equals.");
        else
            System.out.println("Hash sets are not equals.");

        // we can do it in another way
       HashSet<String> result = new HashSet<>();
        for (String e : hashSet
             ) {
            System.out.println(newHashSet.contains(e) ? "Hash sets are equals." : "Hash sets are not equals.");
        }
    }
}
