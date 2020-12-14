/**
 * Write a Java program that accepts three integer values and return true if one of
 * them is 20 or more and less than the substractions of others.
 * Sample Output:
 * Input the first number: 15
 * Input the second number: 20
 * Input the third number: 25
 * false
 */

package com.practice.basic1;

import java.util.Scanner;

public class Ex62 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Input the third number: ");
        int thirdNumber = scanner.nextInt();


        /**
         * The fastest way (the better way).
         */
        System.out.println(Math.abs(firstNumber - secondNumber) >= 20 || Math.abs(secondNumber - thirdNumber) >= 20
                || Math.abs(thirdNumber - firstNumber) >= 20);

        /**
         * A longer way.
         */

        //        System.out.println(count(firstNumber, secondNumber, thirdNumber));
    }

//    public static boolean count(int num1, int num2, int num3) {
//        if (num1 >= 20 && ((num1 < (num2 - num3)) || (num1 < (num3 - num2)))) {
//            return true;
//        } else if (num2 >= 20 && ((num2 < (num1 - num3)) || (num2 < (num3 - num1)))) {
//            return true;
//        } else if (num3 >= 20 && ((num3 < (num1 - num2)) || (num3 < (num2 - num1)))) {
//            return true;
//        }
//        return false;
//    }
}
