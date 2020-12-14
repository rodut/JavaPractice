package com.lessons.collections;

import java.util.*;

public class Basic {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        Map<String, String> map = new HashMap<>();

        collection.add("one");
        collection.add("two");
        collection.add("three");
        System.out.println(collection.size());
        collection.remove("one");
        System.out.println(collection.size());

        /** Search for an element in the collection */
        System.out.println(collection.contains("one"));

        /** Iterate through collection first method*/
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /** Iterate through collection second method*/
        for (String s : collection) {
            System.out.println(s);
        }

        list.add("red");
        list.add("green");
        list.add("blue");
        System.out.println(list.get(1));

        /** There cannot be two identical elements in a Set */
        set.add("Iphone");
        set.add("Iphone");
        set.add("Samsung");
        set.add("Xiaomi");
        System.out.println(set.size());

        System.out.println("**************");
        queue.add("one");
        queue.add("two");
        queue.add("three");
        System.out.println(queue.element());
        System.out.println(queue.remove());
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.offer("four"));
        System.out.println(queue.size());

        System.out.println("*****************");

        map.put("10", "ten");
        map.put("11", "eleven");
        map.put("12", "twelve");
        map.remove("11");
        System.out.println(map.get("12"));
    }
}
