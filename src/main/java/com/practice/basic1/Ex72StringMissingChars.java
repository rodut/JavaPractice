/**
 *  Write a Java program to create a new string taking first three characters from a given string.
 *  If the length of the given string is less than 3 use "#" as substitute characters.
 * Test Data: Str1 = " "
 * Sample Output:
 * ###
 */

package com.practice.basic1;

public class Ex72StringMissingChars {
    public static void main(String[] args) {

        String string = "";

        if (string.length() >3 )
            System.out.println(string.substring(0,3));
        else if (string.length() == 1)
            System.out.println(string.charAt(0)+"##");
        else
            System.out.println("###");
    }
}
