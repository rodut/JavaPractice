/**
 * Write a Java program to retrieve but does not remove, the first element of a linked list.
 */

package com.collectionexercises.linkedlist;

import java.util.LinkedList;

public class Q20 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("John");
        list.add("Bob");
        list.add("Doe");
        list.add("Ben");
        list.add("Carl");

        System.out.println("Element: " + list.peekFirst());
        System.out.println("The list after: " + list);
    }
}
