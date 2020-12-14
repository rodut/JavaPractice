/**
 * Write a Java program that reads a number and display the square, cube, and fourth power.
 * Test Data
 * Input the side length value: 15
 * Expected Output:
 * Square: .2f
 * Cube: .2f
 * Fourth power: 50625.00
 */

package com.practice.datatypes;

import java.util.Scanner;

public class Ex8NumSquareCubeFourthPower {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the side length value: ");
        int length = scanner.nextInt();

        double square = Math.pow(length, 2);
        double cube = Math.pow(length, 3);
        double fourthPower = Math.pow(length, 4);
        System.out.println("Square " + square);
        System.out.println("Cube " + cube);
        System.out.println("Fourth power: " + fourthPower);
    }
}
