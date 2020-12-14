/**
 * Write a Java program to print the contents of a two-dimensional Boolean array where t will represent true and f will represent false.
 * Sample array:
 * array = {{true, false, true},
 * {false, true, false}};
 * Expected Output :
 * t f t
 * f t f
 */

package com.practice.basic2;

public class Ex154 {
    public static void main(String[] args) {

        boolean[][] array = {{true, false, true},
                {false, true, false}};
        int rowsLength = array.length;
        int columnLength = array[0].length;

        for (int i = 0; i < rowsLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                if (array[i][j]) {
                    System.out.print(" t ");
                } else {
                    System.out.print(" f ");
                }
            }
            System.out.println();
        }
    }
}
