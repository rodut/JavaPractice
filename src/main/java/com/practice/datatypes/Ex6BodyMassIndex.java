/**
 * Write a Java program to compute body mass index (BMI).
 * Test Data
 * Input weight in pounds: 452
 * Input height in inches: 72
 * Expected Output:
 * Body Mass Index is 61.30159143458721
 */

package com.practice.datatypes;

import java.util.Scanner;

public class Ex6BodyMassIndex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input weight in pounds: ");
        int weight = scanner.nextInt();
        System.out.print("Input height in inches: ");
        int height = scanner.nextInt();
//        double index = weight / Math.pow(height, 2) * 703;
        double index = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);
        System.out.println("Body Mass Index is " + index);
    }
}
