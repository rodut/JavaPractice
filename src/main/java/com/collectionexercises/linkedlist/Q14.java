/**
 * Write a Java program to remove all the elements from a linked list.
 */

package com.collectionexercises.linkedlist;

import java.util.LinkedList;

public class Q14 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("John");
        list.add("Bob");
        list.add("Doe");
        list.add("Ben");
        list.add("Carl");

        list.clear();

        System.out.println("New list: " + list);
    }
}
