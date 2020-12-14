/**
 * Write a Java program to compute the area of a hexagon.
 * Area of a hexagon = (6 * s^2)/(4*tan(π/6))
 * where s is the length of a side
 * Input Data:
 * Input the length of a side of the hexagon: 6
 * Expected Output:
 * The area of the hexagon is: 93.53074360871938
 */

package com.practice.basic1;

import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of a side of the hexagon: ");
        int sideLength = scanner.nextInt();
        double hexagonArea = (6 * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.println("The area of the hexagon is: " + hexagonArea);
    }
}
