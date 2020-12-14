/**
 * Write a Java program to insert the specified element at the specified position in the linked list.
 */

package com.collectionexercises.linkedlist;

import java.util.LinkedList;

public class Q5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Jack");
        list.add("Bob");
        list.add("Doe");
        list.add("Ben");
        list.add("Carl");

        System.out.println("List before inserting a new element: " + list);
        list.add(2, "Clark");
        System.out.println("List after inserting a new element: " + list);
    }
}
