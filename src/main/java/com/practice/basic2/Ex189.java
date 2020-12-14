/**
 * Write a Java program to Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
 * Expected Output:
 * '123' + '456' = 579
 */

package com.practice.basic2;

public class Ex189 {
    public static void main(String[] args) {

        String firstNumber = "123";
        String secondNumber = "456";
        if(Integer.parseInt(firstNumber) >= 0 && Integer.parseInt(secondNumber) >= 0){
            int sum = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
            System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        }
    }
}
