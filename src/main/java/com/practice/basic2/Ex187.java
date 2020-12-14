/**
 * Write a Java program to find the index of first non-repeating character in a given string.
 * Expected Output:
 * Index of first non-repeating character in 'google' is: 4
 */
package com.practice.basic2;

import java.util.HashMap;

public class Ex187 {
    public static void main(String[] args) {

        String string = "google";
        System.out.println("Index of first non-repeating character in " + string + " is: " + firstUniqueChar(string));

    }

    private static int firstUniqueChar(String string) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char chr = string.charAt(i);
            map.put(chr, map.containsKey(chr) ? map.get(chr) + 1 : 1);
        }
        for (int i = 0; i < string.length(); i++) {
            if (map.get(string.charAt(i)) < 2) {
                return i;
            }
        }
        return -1;
    }
}
