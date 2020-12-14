/**
 * Write a Java program to join two array lists
 */

package com.collectionexercises.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Q15 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Jack");
        list1.add("Doe");
        list1.add("Bob");

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");

        // Join the array lists
//        list1.addAll(list2);
//        System.out.println("Joined lists: " + list1);

        // Another method to join lists
        List<String> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println("New array: " + list3);


    }
}
