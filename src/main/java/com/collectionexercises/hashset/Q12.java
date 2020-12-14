package com.collectionexercises.hashset;

import java.util.HashSet;

public class Q12 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");

        System.out.println("Initial hash set: " + hashSet);

        // clear() method removes all the elements from the hash set
        hashSet.clear();
        System.out.println("The modified hash set: " + hashSet);

    }
}
