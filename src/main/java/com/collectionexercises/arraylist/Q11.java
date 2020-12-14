/**
 * Write a Java program to reverse elements in a array list
 */

package com.collectionexercises.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Q11 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Doe");
        list.add("Bob");

        Collections.reverse(list);
        System.out.println("The reversed list: " + list);
    }
}
