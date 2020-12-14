/**
 * Write a Java program to print the ascii value of a given character.
 * Expected Output
 * The ASCII value of Z is :90
 */

package com.practice.basic1;

import java.util.Scanner;

public class CharAsciiValue {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input the character: \n");
//        String character = scanner.nextLine();
        char character = 'Z';

        System.out.println("The ASCII value of " + character + " is: " + (int) character);
    }
}
