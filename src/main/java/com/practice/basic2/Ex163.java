/**
 * Write a Java program that will accept an integer and convert it into a binary representation.
 * Now count the number of bits which is equal to zero of the said binary representation.
 * Expected Output:
 * Input first number: 25
 * Binary representation of 25 is: 11001
 * Number of zero bits: 2
 */

package com.practice.basic2;

import com.sun.corba.se.impl.ior.FreezableList;

import java.util.Scanner;

public class Ex163 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int number = scanner.nextInt();
        scanner.close();

        /**
         * Convert int to binary string
         */
        String result = Integer.toBinaryString(number);
        System.out.println("Binary representation of 25 is: " + result);

        /**
         * Count the number of zero bits in the string
         */
        int zeros = result.length() - result.replaceAll("0", "").length();
        System.out.println("Number of zero bits: " + zeros);


        /**  We can write it in another way - the second solution */
        System.out.println("Number of zero bits(second solution):  "+ countBitsOfZero(number));

    }

    /**  We can write it in another way - the second solution */
    private static int countBitsOfZero( int n){
        int counter = 0;
        String result = Integer.toBinaryString(n);
        for (char ch : result.toCharArray()) {
            counter += ch == '0' ? 1 : 0;
        }
        return counter;
    }
}
