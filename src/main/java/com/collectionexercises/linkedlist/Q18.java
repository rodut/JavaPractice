/**
 * Write a Java program to clone an linked list to another linked list.
 */

package com.collectionexercises.linkedlist;

import java.util.LinkedList;

public class Q18 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("John");
        list.add("Bob");
        list.add("Doe");
        list.add("Ben");
        list.add("Carl");

        LinkedList clonedList = new LinkedList<>();

        // cloning the first list into the second one
        clonedList = (LinkedList) list.clone();
        System.out.println(clonedList);
    }
}
