/**
 * Write a Java program to convert temperature from Fahrenheit to Celsius degree.
 * Test Data
 * Input a degree in Fahrenheit: 212
 * Expected Output:
 * 212.0 degree Fahrenheit is equal to 100.0 in Celsius
 */

package com.practice.datatypes;

import java.util.Scanner;

public class Ex1ConvertFtoC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}
