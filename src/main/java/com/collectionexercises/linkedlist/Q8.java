/**
 * Write a Java program to insert the specified element at the end of a linked list.
 */

package com.collectionexercises.linkedlist;

import java.util.LinkedList;

public class Q8 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Jack");
        list.add("Bob");
        list.add("Doe");
        list.add("Ben");
        list.add("Carl");

        list.offerLast("Bobbi");
        System.out.println("New list: " + list);
    }
}
