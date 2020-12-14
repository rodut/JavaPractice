/**
 * Write a Java program to break an integer into a sequence of individual digits.
 * Test Data
 * Input six non-negative digits: 123456
 * Expected Output :
 * 1 2 3 4 5 6
 */

package com.practice.datatypes;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ex10BreakIntSequenceIndividualInts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input six non-negative digits: ");
        int number = scanner.nextInt();
        scanner.close();
        int n1 = number / 100000 % 10;
        int n2 = number / 10000 % 10;
        int n3 = number / 1000 % 10;
        int n4 = number / 100 % 10;
        int n5 = number / 10 % 10;
        int n6 = number % 10;
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " ");



    }
}
