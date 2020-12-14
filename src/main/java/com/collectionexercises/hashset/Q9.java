package com.collectionexercises.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q9 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Jack");
        hashSet.add("Bob");

        // converting the hash set into array list
        List<String> list = new ArrayList<>(hashSet);

        // displaying the array list elements
        for (String e: list
             ) {
            System.out.println(e);
        }
    }
}
