package com.javamethodslessons;

import java.util.Scanner;

public class Q2IsEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        if(isEven(number)){
            System.out.println("The number is even.");
        }else{
            System.out.println("The number is odd.");
        }
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }
}
