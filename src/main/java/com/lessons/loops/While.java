/**
 * While loop executa repetat acelasi set de instructiuni atit timp cit expresia e corecta.
 */

package com.lessons.loops;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int count = 1;

        /**
         * Counter controlled loop
         */
        while (count <= 10) {
            System.out.print(count + " ");
            count++;
        }

        /**
         * Sentinel controlled loop
         */
        int value, sum = 0;

        // Creating a Scanner object for keyboard input
        Scanner console = new Scanner(System.in);

        // Getting the first value from the user
        System.out.print("Enter first integer (enter 0 to quit): ");
        value = console.nextInt();

        while (value != 0){
            // Adding value to the sum
            sum += value;

            // Getting the next number from the user
            System.out.print("Enter next integer (enter 0 to quit): ");
            value = console.nextInt();
        }

        // Display the sum
        System.out.println("Sum of the integers: " + sum);

    }
}
