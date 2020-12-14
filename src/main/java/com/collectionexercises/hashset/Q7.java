package com.collectionexercises.hashset;

import java.util.HashSet;

public class Q7 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Jack");
        hashSet.add("Bob");

        // converting a hash set into an array
        String[] array = new String[hashSet.size()];
        hashSet.toArray(array);

        // displaying array elements
        System.out.println("Array elements: ");
        for (String e: array
             ) {
            System.out.println(e);
        }
    }
}
