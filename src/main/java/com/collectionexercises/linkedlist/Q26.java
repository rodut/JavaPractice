/**
 * Write a Java program to replace an element in a linked list.
 */

package com.collectionexercises.linkedlist;

import java.util.LinkedList;

public class Q26 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("John");
        list.add("Bob");
        list.add("Doe");
        list.add("Ben");
        list.add("Carl");

        list.set(3, "Dan");
        System.out.println(list);
    }
}
