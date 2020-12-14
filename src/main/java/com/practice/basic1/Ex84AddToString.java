/**
 * Write a Java program to take the last three characters from a given string and add the three characters
 * at both the front and back of the string. String length must be greater than three and more.
 * Test data: "Python" will be "honPythonhon"
 * Sample Output:
 * honPythonhon
 */

package com.practice.basic1;

public class Ex84AddToString {
    public static void main(String[] args) {

        String string = "Python";
        String newString = "";
        String finalString = "";

        if (string.length() > 3)
            newString = string.substring(string.length() - 3);
            finalString = newString + string + newString;
            System.out.println("Result: " + finalString);


    }
}
