/**
 * Write a Java program to check if a particular element exists in a linked list.
 */

package com.collectionexercises.linkedlist;

import java.util.LinkedList;

public class Q22 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("John");
        list.add("Bob");
        list.add("Doe");
        list.add("Ben");
        list.add("Carl");

        if(list.contains("Bobbi")){
            System.out.println("The element is present in the list.");
        }else{
            System.out.println("The element is not present in the list.");
        }


    }
}
