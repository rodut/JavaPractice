package com.javalessons.collections.collections2;

import com.sun.xml.internal.ws.api.server.LazyMOMProvider;

import java.util.*;

public class Queue_ {
    public static void main(String[] args) {

        Queue queue = new PriorityQueue();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        for (int i = 0; i < queue.size() ; i++) {
            System.out.println(queue.peek()); // peek() - Getting the element but not deleting it
        }
        System.out.println("Number of elements: " + queue.size());

        System.out.println("*****************");
        Iterator iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(queue.poll()); // poll() - Getting all the elements and deleting them
        }
        System.out.println("Number of elements: " + queue.size());
    }

}
