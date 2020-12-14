/**
 * Write a Java program to get the first and last occurrence of the specified elements in a linked list.
 */

package com.collectionexercises.linkedlist;

import java.util.LinkedList;

public class Q10 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Jack");
        list.add("Bob");
        list.add("Doe");
        list.add("Ben");
        list.add("Carl");

        System.out.println("The first element: " + list.getFirst());
        System.out.println("The last element: " + list.getLast());

    }
}
