/**
 * Write a Java program to remove first and last element from a linked list.
 */

package com.collectionexercises.linkedlist;

import java.util.LinkedList;

public class Q13 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("John");
        list.add("Bob");
        list.add("Doe");
        list.add("Ben");
        list.add("Carl");

        list.removeFirst();
        list.removeLast();
        System.out.println("New list: " + list);
    }
}
