/**
 * Set it's an unordered collection (if we use HashSet<>())
 * It saves only unique elements.
 * We can use TreeSet<>() to sort elements.
 */

package com.javalessons.collections.set;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {

        String[] cars = {"Mini", "Mercedes-Benz", "Audi", "VW", "Smart", "Toyota", "Porsche"};
        String[] otherCars = {"Audi", "Ford", "GMC", "Toyota", "Chevrolet"};

//        Set<String> carsSet = new HashSet<>(Arrays.asList(cars));
//
//        Set<String> otherCarsSet = new HashSet<>(Arrays.asList(otherCars));
//
//        Set<String> uniqueCars = new HashSet<>(carsSet);
//        uniqueCars.addAll(otherCarsSet);

//        Set<String> carsSet = new LinkedHashSet<>(Arrays.asList(cars));
//        Set<String> otherCarsSet = new LinkedHashSet<>(Arrays.asList(otherCars));
//        Set<String> uniqueCars = new LinkedHashSet<>(carsSet);
//        uniqueCars.addAll(otherCarsSet);

        Set<String> carsSet = new TreeSet<>(Arrays.asList(cars));
        Set<String> otherCarsSet = new TreeSet<>(Arrays.asList(otherCars));
        Set<String> uniqueCars = new TreeSet<>(carsSet);
        uniqueCars.addAll(otherCarsSet);

        print(uniqueCars);

    }

    private static void print(Set<String> cars){
        System.out.println(cars);
    }
}
