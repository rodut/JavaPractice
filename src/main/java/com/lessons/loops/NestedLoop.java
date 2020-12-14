/**
 *  This program displays a rectangular pattern
 *  of stars.
 */

package com.lessons.loops;

public class NestedLoop {
    public static void main(String[] args) {
        final int MAXROWS = 4, MAXCOLS = 5;
        for (int i = 1; i <= MAXROWS ; i++) {
            for (int j = 1; j <= MAXCOLS ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // This program displays a right angular triangle pattern
        final int SIZE = 6;
        for (int i = 1; i <=SIZE ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
