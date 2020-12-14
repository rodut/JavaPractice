package com.javalessons.collections.collections2;

import java.util.*;

public class List_ {
    public static void main(String[] args) {

        int[] array = new int[15];

        Collection collection = new ArrayList();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.remove("2");

        /**  The cycle "for" works on iterator */
//        for (Object o : collection) System.out.println(o);

        /**
         * List collection2 = new ArrayList();
         * Set collection3 = new HashSet();
         * Queue collection4 = new PriorityQueue();
         * Map map = new HashMap();
         */

        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list.get(1)); // The result will be "2", because the index starts from 0!

        /**  Getting all the elements from the List */
        for (int i = 0; i < list.size(); i++) {  // shortcut "fori"
            System.out.println(list.get(i));
        }

        System.out.println("******************************");

        /**
         * Setting (replacing) an element at a given index (i.e. 2) instead of another element. If there is no element with such index,
         * we will get an IndexOutOfBoundsException.
         * i.e. list.set(3, "5"); -> exception!
         */
        list.set(2, "5");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("******************************");

        /**
         * Add a new element at a given index.
         * If there is no element with such index => IndexOutOfBoundsException!
         * list.add(6, "6");
         */
        list.add(0, "5");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
