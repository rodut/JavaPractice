/**
 * INTERFACE STREAM - permits us to modify elements of collection.
 * <p>
 * The Map interface present in java.util package represents a mapping between a key and a value.
 * The Map interface is not a subtype of the Collection interface. Therefore it behaves a bit differently
 * from the rest of the collection types. A map contains unique keys.
 * <p>
 * Q: Why yo use streams?
 * A: Stream is not a collection. It's a wrapper over existing collections.
 * <p>
 * Streams have two types of methods: modification & actions
 * Benefits: automatic parallelization, parallel threads, unlimited volume of streams (unbounded).
 */

package com.javalessons.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsOverviewMain {

    private static List<Employee> employeeList = new ArrayList<>();
    private static Map<Integer, Employee> employeeMap = null;

    public static void main(String[] args) throws IOException {
        employeeList.add(new Employee(1, "Alex", "Black", 50000));
        employeeList.add(new Employee(2, "John", "Green", 75000));
        employeeList.add(new Employee(6, "Sam", "Brown", 80000));
        employeeList.add(new Employee(9, "Tony", "Grey", 90000));
        employeeList.add(new Employee(20, "Mike", "Yellow", 60000));
        employeeList.add(new Employee(11, "Victoria", "Pink", 75000));
        employeeList.add(new Employee(16, "Sean", "Magenta", 80000));
        employeeList.add(new Employee(19, "Kate", "Black", 88000));
        employeeList.add(new Employee(29, "Tony", "Grey", 90000));
        employeeList.add(new Employee(10, "Mike", "Yellow", 60000));
        employeeList.add(new Employee(21, "Victoria", "Pink", 75000));

//        testStreamFromList();
        testStreamFromFile();
    }

    private static void testStreamFromList() {

        /**  Creating a stream */
        employeeList.stream()
                .filter(e -> e.getSalary() > 60000) // filter elements with salary greater than 60k
                .filter(e -> e.getId() < 10)        // filter elements with id lesser than 10
                .collect(Collectors.toList())       // transforming our elements back to List
                .forEach(System.out::println);      // printing in terminal

        Integer[] ids = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        /**  Creating a stream from an array */
        Optional<Employee> first = Stream.of(ids)
                .map(StreamsOverviewMain::findById)
                .filter(Objects::nonNull)
                .findFirst();
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

    }

    private static void testStreamFromFile() throws IOException {
        Files.lines(Paths.get("out.txt"))
                .filter(e -> e.length() > 4)                                   // only words with >4 letters
                .map(String::toUpperCase)                                      // to upper case
                .distinct()                                                    // words that don't repeat
                .sorted()                                                      // alphabetical sorting
                .forEach(System.out::println);

    }

    private static Employee findById(int id) {
        if (employeeMap == null) {
            employeeMap = employeeList.stream().distinct().collect(Collectors.toMap(Employee::getId, e -> e));
        }
        return employeeMap.get(id);
    }
}
