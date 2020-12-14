/**
 * Write a Java program to compare two linked lists.
 */

package com.collectionexercises.linkedlist;

import java.util.LinkedList;

public class Q24 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("John");
        list.add("Bob");
        list.add("Doe");
        list.add("Ben");
        list.add("Carl");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("John");
        linkedList.add("Bob");
        linkedList.add("Doe");
        linkedList.add("Ben");

        // comparing the lists
        LinkedList<String> compareList = new LinkedList<>();
        for (String e: list
             ) {
            compareList.add(linkedList.contains(e) ? "Yes" : "No");
            System.out.println(compareList);
        }
    }
}
