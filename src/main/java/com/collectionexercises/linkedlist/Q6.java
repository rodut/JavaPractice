/**
 * Write a Java program to insert elements into the linked list at the first and last position.
 */

package com.collectionexercises.linkedlist;

import java.util.LinkedList;

public class Q6 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Jack");
        list.add("Bob");
        list.add("Doe");
        list.add("Ben");
        list.add("Carl");

        System.out.println("List before: " + list);
        list.addFirst("First");
        list.addLast("Last");
        System.out.println("List after: " + list);
    }
}
