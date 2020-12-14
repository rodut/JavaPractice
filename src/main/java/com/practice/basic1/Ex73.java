/**
 * Write a Java program to create a new string taking first and last characters from two given strings.
 * If the length of either string is 0 use "#" for missing character.
 * Test Data: str1 = "Python"
 * str2 = ""
 * Sample Output:
 * P#
 */

package com.practice.basic1;

public class Ex73 {
    public static void main(String[] args) {

        String firstString = "Python";
        String secondString = "";

//        if (secondString.length() == 0)
//            System.out.println(firstString.charAt(0) + "#");
//        else
//            System.out.println(firstString.charAt(0) + secondString.substring(secondString.length() - 1));

        /**  Or we can do it in another way */
        int firstStringLength = firstString.length();
        int secondStringLength = secondString.length();
        String result = "";
        result += (firstStringLength >= 1) ? firstString.charAt(0) : "#";
        result += (secondStringLength >= 1) ? secondString.charAt(secondStringLength-1) : "#";
        System.out.println(result);
    }
}
