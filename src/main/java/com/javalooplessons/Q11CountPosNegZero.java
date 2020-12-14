/**
 * Write a program to enter the numbers till the user wants and at the end
 * it should display the count of positive, negative and zeros entered.
 */

package com.javalooplessons;

import java.util.Scanner;

public class Q11CountPosNegZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char choice;
        int countPositive = 0, countNegative = 0, countZero = 0;

        do {
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();
            if (number < 0) {
                countNegative++;
            } else if (number == 0) {
                countZero++;
            } else {
                countPositive++;
            }

            System.out.print("Do you want to continue y/n?");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println(countZero + " of zero number(s).");
        System.out.println(countPositive + " of positive number(s).");
        System.out.println(countNegative + " of negative number(s).");
    }

}
