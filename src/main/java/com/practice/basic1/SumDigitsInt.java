/**
 * Write a Java program and compute the sum of the digits of an integer.
 * Input Data:
 * Input an integer: 25
 * Expected Output
 * The sum of the digits is: 7
 */

package com.practice.basic1;

import java.util.Scanner;

public class SumDigitsInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int number = scanner.nextInt();
        System.out.println("The sum of the digits is: "+getSum(number));
    }
    public static int getSum(int n){
        int sum = 0;

        while (n !=0){
            sum = sum + n % 10;
            n = n/10;
        }
        return sum;
    }
}
