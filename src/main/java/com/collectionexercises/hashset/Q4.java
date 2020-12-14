package com.collectionexercises.hashset;

import java.util.HashSet;

public class Q4 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Jack");
        hashSet.add("Bob");

        // emptying the hash set
        hashSet.clear();
        System.out.println("The new hash set: " + hashSet);

        // removing all the elements from the hash set
        hashSet.removeAll(hashSet);
        System.out.println("After the removing: " + hashSet);
    }
}
