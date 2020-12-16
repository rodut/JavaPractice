package com.practice.edabit;

public class ConcatFirstLastName {
    public static void main(String[] args) {
        System.out.println(concatenateStrings("Mary", "Jane"));
    }

    public static String concatenateStrings(String firstName, String lastName){
        return lastName + ", " + firstName;
    }
}
