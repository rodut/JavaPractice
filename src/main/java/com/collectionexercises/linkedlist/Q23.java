/**
 * Write a Java program to convert a linked list to array list.
 */

package com.collectionexercises.linkedlist;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q23 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("John");
        list.add("Bob");
        list.add("Doe");
        list.add("Ben");
        list.add("Carl");

        List<String> arrayList = new ArrayList<>(list);
        System.out.println("ArrayList elements are: ");
        for (String e:arrayList
             ) {
            System.out.println(e);
        }
    }
}
