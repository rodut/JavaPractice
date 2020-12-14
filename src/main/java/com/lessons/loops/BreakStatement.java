/**
 * This program demonstrates break to exit a loop.
 * Atunci cind folosim "brake statement" in loop, el e finisat si programul rezuma cu urmatorul statement.
 */

package com.lessons.loops;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            if(i == 5)
                break;  // terminate loop if i is 5
            System.out.print(i + " ");
        }
        System.out.print("Loop is over.");
    }
}
