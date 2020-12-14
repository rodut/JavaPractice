package com.practice;

import java.util.Scanner;

public class RandomNumGen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int generatedNumber;

        System.out.print("Enter the number of ints you need to be generated: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            generatedNumber = (int) (Math.random() * 1000) + 1;
            System.out.println(generatedNumber);
        }
    }
}
