/**
 * Write a Java program to check if a string starts with a specified word.
 * Sample Data: string1 = "Hello how are you?"
 * Sample Output:
 * true
 */

package com.practice.basic1;

public class Ex85CheckStringSpecificWord {
    public static void main(String[] args) {

        String string = "Hello how are you?";
        String subString = "Hello ";
        System.out.println(checking(string, subString));

        /**  We can write it in another way */
        System.out.println(string.startsWith(subString));

    }

    private static boolean checking(String string, String subString){
        return string.startsWith(subString);
    }
}
