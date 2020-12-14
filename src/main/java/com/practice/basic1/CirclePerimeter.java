/**
 * Write a Java program to print the area and perimeter of a circle.
 * Test Data:
 * Radius = 7.5
 * Expected Output
 * Perimeter is = 47.12388980384689
 * Area is = 176.71458676442586
 */
package com.practice.basic1;

public class CirclePerimeter {

    private static final double RADIUS = 7.5;
    private static final double PI = 3.14159265359;
    private static double perimeter;
    private static double area;

    public static void main(String[] args) {
        perimeter = PI * (2 * RADIUS);
        System.out.println(perimeter);

        area = PI * Math.pow(RADIUS, 2);
        System.out.println(area);
    }
}
