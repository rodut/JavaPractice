/**
 * Write a Java program to find the value of specified expression.
 * a) 101 + 0) / 3
 * b) 3.0e-6 * 10000000.1
 * c) true && true
 * d) false && true
 * e) (false && false) || (true && true)
 * f) (false || false) && (true && true)
 * Expected Output :
 * (101 + 0) / 3)-> 33
 * (3.0e-6 * 10000000.1)-> 30.0000003
 * (true && true)-> true
 * (false && true)-> false
 * ((false && false) || (true && true))-> true
 * (false || false) && (true && true)-> false
 */

package com.practice.basic2;

public class Ex151 {
    public static void main(String[] args) {
        int num1 = (101 + 0) / 3;
        System.out.println(num1);

        double num2 = 3.0e-6 * 10000000.1;
        System.out.println(num2);

        boolean random1 = true && true;
        boolean random2 = false && true;
        boolean random3 = (false && false) || (true && true);
        boolean random4 = (false || false) && (true && true);
        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);
        System.out.println(random4);

    }
}
