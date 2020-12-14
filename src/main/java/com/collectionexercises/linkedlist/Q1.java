/**
 * Write a Java program to append the specified element to the end of a linked list.
 */

package com.collectionexercises.linkedlist;

import java.util.LinkedList;

public class Q1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Jack");
        list.add("Bob");
        list.add("Doe");

        System.out.println("The list: " + list);
    }
}
