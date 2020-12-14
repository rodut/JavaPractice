/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 */

package com.practice.basic1;

import java.util.Scanner;

public class AddTwoBinaryNrs {

    public static void main(String[] args) {

        /**  This is to hold the output binary number */
        int[] sum = new int[10];
        int i = 0, remainder = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first binary number: ");
        int firstBinaryNumber = scanner.nextInt();
        System.out.println("Input second binary number: ");
        int secondBinaryNumber = scanner.nextInt();

        /**  Closing scanner after use to avoid memory leak */
        scanner.close();

        while (firstBinaryNumber != 0 || secondBinaryNumber != 0){
            sum[i++] = (firstBinaryNumber %10 + secondBinaryNumber % 10 + remainder) % 2;
            remainder = (firstBinaryNumber % 10 + secondBinaryNumber % 10 + remainder) /2;
            firstBinaryNumber = firstBinaryNumber/10;
            secondBinaryNumber = secondBinaryNumber/10;
        }
        if(remainder !=0){
            sum[i++] = remainder;
        }
        --i;
        System.out.println("The sum of two binary numbers: ");
        while (i>=0){
            System.out.print(sum[i--]);
        }
    }
}
