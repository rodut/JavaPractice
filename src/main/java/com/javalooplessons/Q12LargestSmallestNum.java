/**
 * Write a program to enter the numbers till the user wants and at the end
 * the program should display the largest and smallest numbers entered.
 */

package com.javalooplessons;

import java.util.Scanner;

public class Q12LargestSmallestNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char choice;
        int largestNum = 0, smallestNum = 0;

        do{
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();

            if(number>largestNum){
                largestNum = number;
            }
            if (number< smallestNum){
                smallestNum = number;
            }

            System.out.print("Do you want to continue y/n?");
            choice = scanner.next().charAt(0);
        }while (choice == 'y' || choice == 'Y');
        System.out.println("The largest number is: " + largestNum);
        System.out.println("The smallest number is: " + smallestNum);
    }
}
