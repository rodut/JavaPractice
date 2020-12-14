/**
 * Return a random number in range
 */

package com.practice.basic;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the minimum number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input the maximum number: ");
        int secondNumber = scanner.nextInt();

        System.out.println(generateRandomInRange(firstNumber, secondNumber));
    }

    public static int generateRandomInRange(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);

//        Random random = new Random();
//        return random.nextInt(max - min) + min;
    }

}
