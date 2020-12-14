/**
 * Write a Java program to remove a specified element from a linked list.
 */

package com.collectionexercises.linkedlist;

import java.util.LinkedList;

public class Q12 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("John");
        list.add("Bob");
        list.add("Doe");
        list.add("Ben");
        list.add("Carl");

        // remove object by name
        list.remove("Ben");

        // remove by index
        list.remove(1);

        System.out.println("New list: " + list);
    }
}
