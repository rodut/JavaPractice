/**
 *  Write a Java program to extract a portion of a array list
 */

package com.collectionexercises.arraylist;

import java.util.ArrayList;

public class Q12 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Doe");
        list.add("Bob");

        System.out.println("Sublist: " + list.subList(1,2));;
    }
}
