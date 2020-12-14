/**
 * Write a Java program to display the elements and their positions in a linked list.
 */

package com.collectionexercises.linkedlist;

import java.util.LinkedList;

public class Q11 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Jack");
        list.add("Bob");
        list.add("Doe");
        list.add("Ben");
        list.add("Carl");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element " + list.get(i) + " is in position "+ i);
        }
    }
}
