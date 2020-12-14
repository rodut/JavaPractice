package com.collectionexercises.hashset;

import java.util.HashSet;

public class Q3 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Jack");
        hashSet.add("Bob");

        // getting the number of elements in the hash set and printing it
        System.out.println("There are " + hashSet.size() + " element(s) in the hash set.");
    }
}
