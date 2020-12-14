/**
 * Write a Java program to test an linked list is empty or not.
 */

package com.collectionexercises.linkedlist;

import java.util.LinkedList;

public class Q25 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("John");
        list.add("Bob");
        list.add("Doe");
        list.add("Ben");
        list.add("Carl");

        // checking if list is empty
        if(list.isEmpty()){
            System.out.println("The list is empty.");
        }else{
            System.out.println("The list it not empty.");
        }
    }
}
