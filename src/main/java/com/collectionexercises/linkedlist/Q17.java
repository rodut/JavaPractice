/**
 * Write a Java program to join two linked lists.
 */

package com.collectionexercises.linkedlist;

import java.util.LinkedList;

public class Q17 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("John");
        list1.add("Bob");
        list1.add("Doe");
        list1.add("Ben");
        list1.add("Carl");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Olaf");
        list2.add("Gustav");

        // adding the second list into the first
        list1.addAll(list2);
        System.out.println(list1);

        // combining two lists into a new one
        LinkedList<String> newList = new LinkedList<>();
        newList.addAll(list1);
        newList.addAll(list2);
        System.out.println("The new list: " + newList);


    }
}
