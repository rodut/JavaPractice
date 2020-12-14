/**
 * Write a Java program to iterate through all elements in a linked list starting at the specified position.
 */

package com.collectionexercises.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Jack");
        list.add("Bob");
        list.add("Doe");

        Iterator iterator = list.listIterator(1);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // We can do the same thing with ListIterator

        ListIterator listIterator = list.listIterator(1);
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
