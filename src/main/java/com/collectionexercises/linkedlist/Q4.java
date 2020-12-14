/**
 * Write a Java program to iterate a linked list in reverse order
 */

package com.collectionexercises.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Q4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Jack");
        list.add("Bob");
        list.add("Doe");

        Iterator iterator = list.descendingIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }
}
