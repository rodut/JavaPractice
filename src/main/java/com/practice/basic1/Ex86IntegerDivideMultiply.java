/**
 * Write a Java program start with an integer n, divide n by 2 if n is even or multiply
 * by 3 and add 1 if n is odd, repeat the process until n = 1.
 */
package com.practice.basic1;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Ex86IntegerDivideMultiply {
    public static void main(String[] args) {

//        int counter = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input the number: ");
//        int number = scanner.nextInt();
//        int oddNumber;

//        if (number == 1)
//            System.exit(0);
//        else if (number % 2 == 0)
//            System.out.println("The number is even so the result will be: " + number / 2);
//                counter +=1;
//        else
//            oddNumber = number * 3 + 1;
//        System.out.println("The number is odd so the result will be: " + oddNumber);
//        counter += 1;
//        scanner.close();

        /** We can write it*/
//        while (number != 1) {
//            if (number % 2 == 0){
//                System.out.println("The number is even so the result will be: " + number / 2);
//                counter += 1;}
//            else{
//                oddNumber = (number * 3 + 1)/2;
//                System.out.println("The number is odd so the result will be: " + oddNumber);
//                counter +=1;
//            }
//        }
//        System.out.println(counter);

        int ctr = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = in.nextInt();
        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 0) {
                n = n / 2;
            }
            else {
                n = (3 * n + 1) / 2;
            }
            ctr += 1;
        }
        System.out.println(ctr);
        in.close();
    }
}
