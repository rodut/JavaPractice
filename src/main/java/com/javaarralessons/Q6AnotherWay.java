package com.javaarralessons;

import java.util.Scanner;

public class Q6AnotherWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");

        int size = scanner.nextInt();
        int[] list = new int[size];

        System.out.println("Enter " + list.length + " integers: ");

        //Input the data received from user in array
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }

        int max = list[0];
        int min = list[0];

        for (int i = 1; i < list.length; i++) {
            if(list[i] > max){
                max = list[i];
            }
            if(list[i] < min){
                min = list[i];
            }
        }

        System.out.println("Largest element is: " + max);
        System.out.println("Smallest element is: " + min);
    }
}
