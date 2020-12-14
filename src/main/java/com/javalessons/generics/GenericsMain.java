/**
 * Compile type (atunci cind se scrie) & runtime (cind se executa) type bugs.
 * Generics provide compile-time type safety that allows programmers to catch invalid types at compile time.
 * Ne permite sa nu incurcam int cu String, etc.
 * Ne permite sa creeam clase parametrizate personale.
 */

package com.javalessons.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {

        Container<Integer> box = new Container<>(1);
        System.out.println(box.getObject1() * 2);

        Container<String> box2 = new Container<>("1");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


    }
}
