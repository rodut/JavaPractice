/**
 * Write a Java program to remove and return the first element of a linked list.
 */

package com.collectionexercises.linkedlist;

import java.util.LinkedList;

public class Q19 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("John");
        list.add("Bob");
        list.add("Doe");
        list.add("Ben");
        list.add("Carl");

        System.out.println("Element: " + list.pop());
//        System.out.println("New list: " + list.removeFirst());
        System.out.println("The list after: " + list);
    }
}
