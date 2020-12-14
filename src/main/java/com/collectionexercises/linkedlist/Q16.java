/**
 * Write a Java program to shuffle the elements in a linked list.
 */

package com.collectionexercises.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Q16 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("John");
        list.add("Bob");
        list.add("Doe");
        list.add("Ben");
        list.add("Carl");

        Collections.shuffle(list);
        System.out.println("New list: " + list);
    }
}
