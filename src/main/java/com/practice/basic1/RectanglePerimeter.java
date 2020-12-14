/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data: Width = 5.5 Height = 8.5.
 */
package com.practice.basic1;

public class RectanglePerimeter {

    private static final double WIDTH = 5.5;
    private static final double HEIGHT = 8.5;

    public static void main(String[] args) {
        double rectanglePerimeter = 2 * (WIDTH + HEIGHT);
        double rectangleArea = WIDTH * HEIGHT;
        System.out.println("The perimeter of the rectangle is: " + rectanglePerimeter);
        System.out.println("The area of the rectangle is: " + rectangleArea);

    }
}
