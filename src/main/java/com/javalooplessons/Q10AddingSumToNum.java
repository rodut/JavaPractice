/**
 * Write a do-while loop that asks the user to enter two numbers.
 * The numbers should be added and the sum displayed.
 * The loop should ask the user whether he or she wishes to perform the operation again.
 * If so, the loop should repeat; otherwise it should terminate.
 */

package com.javalooplessons;

import java.util.Scanner;

public class Q10AddingSumToNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char choice;


        do {
            System.out.print("Enter the first number: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int secondNumber = scanner.nextInt();

            int sum = firstNumber + secondNumber;
            System.out.println("The sum of the numbers is: " + sum);

            System.out.print("Do you want to continue y/n?");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }
}
