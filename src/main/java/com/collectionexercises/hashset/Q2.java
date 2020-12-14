package com.collectionexercises.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Q2 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Jack");
        hashSet.add("Bob");

        //  enhanced "for"
        for (String e : hashSet) {
            System.out.println(e);
        }

        // we can do it another way

        // set Iterator
        Iterator<String> iterator = hashSet.iterator();

        //  iterate through all elements in a hash set list
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
