/**
 * Write a Java program to swap two variables.
 */

package com.practice.basic1;

public class SwapTwoVars {

    static float first = 1.20f, second = 2.45f;

    public static void main(String[] args) {
        System.out.println("Before the swap");
        System.out.println("First number: " + first);
        System.out.println("Second number: "+ second);

        /**  Value of the first variable is assigned to a temporary variable*/

        float temporary = first;

        /**  Value of the second is assigned to the first variable */
        first = second;

        /**  Value of temporary (which contains the initial value of first) is assigned to second */
        second = temporary;

        System.out.println("\n");
        System.out.println("After the swap");
        System.out.println("First number: "+ first);
        System.out.println("Second number: "+ second);
    }
}
