/**
 * Write a Java program to iterate through all elements in a linked list.
 */

package com.collectionexercises.linkedlist;

import java.util.LinkedList;

public class Q2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Jack");
        list.add("Bob");
        list.add("Doe");

        for (String e : list) {
            System.out.println(e);
        }
    }
}
