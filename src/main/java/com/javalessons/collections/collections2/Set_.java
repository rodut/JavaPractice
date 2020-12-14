package com.javalessons.collections.collections2;

import java.util.HashSet;
import java.util.Set;

public class Set_ {
    public static void main(String[] args) {

        /**
         * Set isn't printing duplicates, only unique elements!
         */
        Set set = new HashSet();
        set.add("1");
        set.add("1");
        set.add("2");
        set.add("2");
        set.add("3");
        set.add("3");
        for(Object o: set)
            System.out.println(o);  // Result: "1 2 3"
    }
}
