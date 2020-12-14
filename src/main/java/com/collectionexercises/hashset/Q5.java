package com.collectionexercises.hashset;

import java.util.HashSet;

public class Q5 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Jack");
        hashSet.add("Bob");

        if(hashSet.isEmpty())
            System.out.println("The hash set is empty.");
        else
            System.out.println("The hash set is not empty.");
    }
}
