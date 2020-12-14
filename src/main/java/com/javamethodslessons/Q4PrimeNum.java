/**
 * Write a method named isPrime, which takes an integer as an argument and returns
 * true if the argument is a prime number, or false otherwise.
 * Also write main method that displays prime numbers between 1 to 500.
 */

package com.javamethodslessons;

import java.util.Scanner;

public class Q4PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }

        for (int i = 1; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;

    }
}
