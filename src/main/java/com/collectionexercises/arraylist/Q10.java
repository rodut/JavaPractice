/**
 * Write a Java program to shuffle elements in a array list
 */

package com.collectionexercises.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Q10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Doe");
        list.add("Bob");

        Collections.shuffle(list);
        System.out.println("The shuffled list: " + list);
    }
}
