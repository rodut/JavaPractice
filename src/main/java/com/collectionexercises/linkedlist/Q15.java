/**
 * Write a Java program of swap two elements in an linked list.
 */

package com.collectionexercises.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Q15 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("John");
        list.add("Bob");
        list.add("Doe");
        list.add("Ben");
        list.add("Carl");

        Collections.swap(list, 0, 4);
        System.out.println("New list: " + list);
    }
}
