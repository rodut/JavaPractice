/**
 * Write a Java program than read an integer and calculate the sum of
 * its digits and write the number of each digit of the sum in English.
 */
package com.practice.basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex87WriteSumIntsInEnglish {
    public static void main(String[] args) {

//        /**  The sum of the digits of the input int */
//        int sum = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int number = scanner.nextInt();
//
//        while (number > 0) {
//            int n = number % 10;
//            sum = sum + n;
//            number = number / 10;
//        }
//        System.out.println("Sum of digits is: " + sum);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number: ");

        try {
            int sum = 0;
            String string = bufferedReader.readLine();
            char[] numStr = string.toCharArray();
            for (char c : numStr) {
                sum += c - '0';
            }
            System.out.println("Original number: " + string);

            printNumber(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printNumber(int n) {
        int x;
        int y;
        int z;
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        System.out.println("Sum of the digits of the said number is: " + n);

        if (n < 10) {
            System.out.println("In English: " + number[n]);
        } else if (n < 100) {
            x = n / 10;
            y = n - x * 10;
            System.out.println("In English: " + number[x] + " " + number[y]);
        } else {
            x = n / 100;
            y = (n - x * 100) / 10;
            z = n - x * 100 - y * 100;
            System.out.println("In English: " + number[x] + " " + number[y] + " " + number[z]);
        }
    }
}
