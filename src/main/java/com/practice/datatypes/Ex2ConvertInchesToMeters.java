/**
 * Write a Java program that reads a number in inches, converts it to meters.
 * Note: One inch is 0.0254 meter.
 * Test Data
 * Input a value for inch: 1000
 * Expected Output :
 * 1000.0 inch is 25.4 meters
 */

package com.practice.datatypes;

import java.util.Scanner;

public class Ex2ConvertInchesToMeters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double inches = scanner.nextDouble();
        double meters = inches * 0.0254;
        System.out.println(inches + " inch is " + meters + " meters");
    }
}
