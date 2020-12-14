package com.lessons.collections;

import java.util.*;

public class UsingList {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        List<String> vector = new Vector<>();
        List<String> stack = new Stack<>();
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());

        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("B");

        /** Cannot modify when iterate */
//        for (String s : arrayList) {
//            System.out.println(s);
////            arrayList.remove(1);
//        }

        System.out.println("***********");

        /** Sorting */
        // without sorting
        for (String s: arrayList) {
            System.out.println(s);
        }
        System.out.println("***********");

        // With sorting
        Collections.sort(arrayList);
        for (String s: arrayList) {
            System.out.println(s);
        }

        System.out.println("***********");

        List<Student> students = new ArrayList<>();
        students.add(new Student(3));
        students.add(new Student(1));
        students.add(new Student(2));

        // without sorting
        for (Student s: students) {
            System.out.println(s.id);
        }
        System.out.println("***********");

        // With sorting
        Collections.sort(students);
        for (Student s: students) {
            System.out.println(s.id);
        }
    }

    private static class Student implements Comparable{
        int id;
        String name;

        public Student(int id) {
            this.id = id;
        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }
}
