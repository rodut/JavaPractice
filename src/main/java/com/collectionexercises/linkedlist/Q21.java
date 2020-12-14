/**
 * Write a Java program to retrieve but does not remove, the last element of a linked list.
 */

package com.collectionexercises.linkedlist;

import java.util.LinkedList;

public class Q21 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("John");
        list.add("Bob");
        list.add("Doe");
        list.add("Ben");
        list.add("Carl");

        System.out.println("Element: " + list.peekLast());
        System.out.println("The list after: " + list);

    }
}
