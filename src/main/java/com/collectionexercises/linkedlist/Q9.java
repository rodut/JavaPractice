/**
 * Write a Java program to insert more elements at the specified position into a linked list.
 */

package com.collectionexercises.linkedlist;

import java.util.LinkedList;

public class Q9 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Jack");
        list.add("Bob");
        list.add("Doe");
        list.add("Ben");
        list.add("Carl");

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Bobbi");
        list1.add("Phoenix");
        list.addAll(3, list1);

        System.out.println("New list: " + list);

    }
}
