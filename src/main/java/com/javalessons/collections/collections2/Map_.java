package com.javalessons.collections.collections2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_ {
    public static void main(String[] args) {

        /**
         * Map has no add(). No inheritance from Collection.
         * Map is using KEY to put() / get() / remove() something.
         */
        Map collection = new HashMap();
        collection.put(123456, "First book");
        collection.put(234567, "Second book");
        collection.put(345678, "Third book");
        System.out.println(collection.get(123456)); // get() by KEY

        /**
         * Getting all from "collection"
         */
        Set set = collection.entrySet();
        for(Object o: set)
            System.out.println(o);

        System.out.println("**********************");
        /**  Getting all from "collection" using KEY */
        Set set1 = collection.keySet();
        for(Object o: set)
            System.out.println(o);
    }
}
