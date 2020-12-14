/**
 * https://www.w3resource.com/java-exercises/basic/index.php
 * Write a Java program to create a string in the form short_string + long_string + short_string from two strings.
 * The strings must not have the same length.
 * Test Data: Str1 = Python
 * Str2 = Tutorial
 * Sample Output:
 * PythonTutorialPython
 */

package com.practice.basic1;

public class Ex70StringFromTwoStrings {
    public static void main(String[] args) {

        String firstString = "Python";
        String secondString = "Tutorial";

        if (firstString.length() == secondString.length())
            System.out.println("Both strings have an equal length.");
        else
            System.out.println(firstString + secondString + firstString);

//        compare(firstString, secondString);

    }
//    private static void compare(String x, String y){
//        if(x.length() == y.length()){
//            System.out.println("Both strings have an equal length.");
//        } else {
//            System.out.println(x + y + x); ;
//        }
//    }
}
