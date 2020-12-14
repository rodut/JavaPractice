/**
 * Write a Java program to check if three given side lengths (integers) can make a triangle or not.
 * Expected Output:
 * Input side1: 5
 * Input side2: 6
 * Input side3: 8
 * Is the said sides form a triangle: true
 */
package com.practice.basic2;

import java.util.Scanner;

public class Ex195 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input side1: ");
        int side1 = scanner.nextInt();
        System.out.print("Input side2: ");
        int side2 = scanner.nextInt();
        System.out.print("Input side3: ");
        int side3 = scanner.nextInt();

        System.out.println("Is the said sides form a triangle: " + checkIfTriangle(side1, side2, side3));
    }

    private static boolean checkIfTriangle(int x, int y, int z){
        return x + y > z && x + z > y && y + z > x;
    }
}
