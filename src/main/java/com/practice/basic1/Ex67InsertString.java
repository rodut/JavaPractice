/**
 * Write a Java program to insert a word in the middle of the another string.
 * Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
 * Sample Output:
 * Python Tutorial 3.0
 */

package com.practice.basic1;

public class Ex67InsertString {
    public static void main(String[] args) {

        String defaultString = "Python 3.0";
        String insertString = "Tutorial";

        System.out.println(defaultString.substring(0,7) + insertString + defaultString.substring(6));
    }
}
