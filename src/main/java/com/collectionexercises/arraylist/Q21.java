/**
 * Write a Java program to replace the second element of a ArrayList with the specified element
 */

package com.collectionexercises.arraylist;

import java.util.ArrayList;

public class Q21 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Doe");
        list.add("Bob");

        list.set(1, "Hercule");
        System.out.println("New list: " + list);

        for (String element:list) {
            System.out.println(element);
        }
    }
}
