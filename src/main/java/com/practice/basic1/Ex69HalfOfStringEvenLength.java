/**
 * https://www.w3resource.com/java-exercises/basic/index.php
 * Write a Java program to extract the first half of a string of even length.
 * Test Data: Python
 * Sample Output:
 * "yt
 */

package com.practice.basic1;

public class Ex69HalfOfStringEvenLength {
    public static void main(String[] args) {

        String mainString = "Python";
        System.out.println(mainString.substring(0, mainString.length()/2));
    }
}
