/**
 * Write a Java program to count the letters, spaces, numbers and other characters of an input string.
 * Expected Output
 * The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
 * letter: 23
 * space: 9
 * number: 10
 * other: 6
 */

package com.practice.basic1;

import java.util.Scanner;

public class CountLetters {
    private static String string;
    private static int lettersNumber;
    private static int spacesNumber;
    private static int numbers;
    private static int otherChars;
    private static int allChars;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What's the string? ");
        string = scanner.nextLine();
//        countAllCharacters();
//        countAllSpaces();
//        countNumbers();
//        countLetters();
//        countOther();
        count();
    }


//    public static void countAllCharacters() {
//
//        for (int i = 0; i < string.length(); i++) {
//            allChars++;
//        }
//        System.out.println("All chars nr.: " + allChars);
//    }
//
//    public static void countAllSpaces() {
//        for (int i = 0; i < string.length(); i++) {
//            if (Character.isWhitespace(string.charAt(i)))
//                spacesNumber++;
//        }
//        System.out.println("There are " + spacesNumber + " spaces in this string.");
//    }
//
//    public static void countNumbers() {
//        for (int i = 0; i < string.length(); i++) {
//            if (Character.isDigit(string.charAt(i)))
//                numbers++;
//        }
//        System.out.println("Number of integers: " + numbers);
//    }
//
//    public static void countLetters() {
//        for (int i = 0; i < string.length(); i++) {
//            if (Character.isAlphabetic(string.charAt(i)))
//                lettersNumber++;
//        }
//        System.out.println("Number of letters: " + lettersNumber);
//    }
//
//    public static void countOther(){
//        for(int i = 0; i < string.length(); i++){
//            if(!Character.isAlphabetic(string.charAt(i)) && !Character.isDigit(string.charAt(i)) && !Character.isWhitespace(string.charAt(i)))
//                otherChars++;
//        }
//        System.out.println("Number of other chars: " + otherChars);
//    }

    public static void count() {
        for (int i = 0; i < string.length(); i++) {
            allChars++;
            if (Character.isWhitespace(string.charAt(i))) {
                spacesNumber++;
            } else if (Character.isDigit(string.charAt(i))) {
                numbers++;
            } else if (Character.isAlphabetic(string.charAt(i))) {
                lettersNumber++;
            } else {
                otherChars++;
            }
        }
        System.out.println("All chars nr.: " + allChars);
        System.out.println("There are " + spacesNumber + " spaces in this string.");
        System.out.println("Number of integers: " + numbers);
        System.out.println("Number of letters: " + lettersNumber);
        System.out.println("Number of other chars: " + otherChars);
    }
}
