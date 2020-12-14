/**
 * Difference between Arrays and List (or Map) is that Arrays are not dynamic.
 * In an Array you have to give the number of how many items you want to hold.
 * A List (Set) it's dynamic, you don't have to give a number, it will change by itself.
 * List can contain duplicates. A Set cannot contain duplicates.
 *
 */

package com.javalessons.collections.collections2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] things = {"eggs", "lasers", "hats", "pie"};

        /**  When we are creating a List, we need to tell what type of data we will use */
        List<String> list = new ArrayList<>();

        /**  Add Array items to List */
        for(String x: things)
            list.add(x);

        String[] moreThings = {"lasers", "hats"};
        List<String> newList = new ArrayList<>();
        for(String y: moreThings)
            newList.add(y);

        for(int i=0; i<list.size(); i++){
            System.out.printf("%s ", list.get(i));
        }

        for(int i = 0; i<newList.size(); i++){
            System.out.printf("%s ", newList.get(i));
        }
    }
}
