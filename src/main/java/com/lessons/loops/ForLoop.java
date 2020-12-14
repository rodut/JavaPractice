/**
 * The following program prints a sequence of values in the left column and their logarithms in the right column.
 */

package com.lessons.loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // This program demonstrates a counter controlled for loop

        Scanner scanner = new Scanner(System.in);
        System.out.println("Table of sequence and their logarithms.");

        // Get the maximum number to display
        System.out.print("Enter the last number: ");
        int maxValue = scanner.nextInt();

        for(int i = 1; i <= maxValue; i++){
            System.out.println(i + "\t" + Math.log(i));
        }
    }
}
