/**
 * A Collection is a group of individual objects represented as a single unit. Java provides Collection Framework
 * which defines several classes and interfaces to represent a group of objects as a single unit.
 * The Collection interface (java.util.Collection) and Map interface (java.util.Map) are the two main “root”
 * interfaces of Java collection classes.
 */

package com.javalessons.collections.autoboxing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);


        String[] colors = {"Yellow", "Green", "Blue"};

        /**  Converting Array to Collection */
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList(colors));
        linkedList.add("Black");

        /**  Converting collection to array */
        colors = linkedList.toArray(new String[linkedList.size()]);

        for (int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }
    }
}
