/**
 * Write a Java program to create the concatenation of the two strings except removing the first character of each string.
 * The length of the strings must be 1 and above.
 * Test Data: Str1 = Python
 * Str2 = Tutorial
 * Sample Output:
 * ythonutorial
 */

package com.practice.basic1;

public class Ex71ConcatTwoStringsRemoveFirstChar {
    public static void main(String[] args) {

        String firstString = "Python";
        String secondString = "Tutorial";

//        String newFirstString = firstString.substring(1);
//        String newSecondString = secondString.substring(1);
//        String concatString = newFirstString + newSecondString;
//        System.out.println("Result: " + concatString);

        /**  A simple way to write it */
        System.out.println(firstString.substring(1) + secondString.substring(1));

    }
}
