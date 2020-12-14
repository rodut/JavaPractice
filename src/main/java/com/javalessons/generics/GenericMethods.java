/**
 * Naming convention:
 * E - Element
 * K - Key
 * N - Number
 * T - Type
 * V - Value
 * S, U, V, etc.
 */

package com.javalessons.generics;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethods<T> {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 0, 8, 5, 6};
        Double[] doubleArray = {0.234, 6.45, 9.034, 1.345, 4.675};
        String[] stringArray = {"One", "Two", "Three", "Four"};

        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);

        System.out.println("Max for array of Integer: " + findMax(intArray));
        System.out.println("Max for array of Double: " + findMax(doubleArray));
        System.out.println("Max for array of String: " + findMax(stringArray));

        Number n = Integer.valueOf(20);

        System.out.println("********************");

        List<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        printElements(list);

        printElements(Arrays.asList(intArray));

        MyBox<Integer> myBox = new MyBox<>("");

        Double aDouble = MyBox.returnValue(0.03);
        System.out.println(aDouble);
    }

//    private static void printArray(Integer[] array) {
//        System.out.println("Non generic method called.");
//        for (Integer element : array)
//            System.out.printf("%s ", element);
//        System.out.println();
//    }
//
//    private static void printArray(Double[] array){
//        System.out.println("Non generic method called.");
//        for (Double element : array)
//            System.out.printf("%s ", element);
//        System.out.println();
//    }
//
//    private static void printArray(String[] array){
//        System.out.println("Non generic method called.");
//        for (String element : array)
//            System.out.printf("%s ", element);
//        System.out.println();
//    }


    /**
     * Instead of using all those three methods, we can use one generic method!
     */

    private static <T> void printArray(T[] array) {
        System.out.println("Non generic method called.");
        for (T element : array)
            System.out.printf("%s, ", element);
        System.out.println();
    }

    private static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (T element : array)
            if (element.compareTo(max) > 0)
                max = element;
        return max;
    }

    private static void printElements(List<Number> list){
        for(Number n : list)
            System.out.println(n);
    }

}
