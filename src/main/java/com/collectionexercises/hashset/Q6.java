package com.collectionexercises.hashset;

import java.util.HashSet;

public class Q6 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Jack");
        hashSet.add("Bob");

        // cloning a hash set into another
        HashSet hashSet1;
        hashSet1 = (HashSet) hashSet.clone();
        System.out.println("The cloned hash set is: " + hashSet1);
    }
}
