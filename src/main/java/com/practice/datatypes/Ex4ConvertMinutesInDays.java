/**
 * Write a Java program to convert minutes into a number of years and days.
 * Test Data
 * Input the number of minutes: 3456789
 * Expected Output :
 * 3456789 minutes is approximately 6 years and 210 days
 */

package com.practice.datatypes;

import java.util.Scanner;

public class Ex4ConvertMinutesInDays {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input the number of minutes: ");
//        int minutes = scanner.nextInt();
//        int year = minutes / 525600;
//        int remainingMinutes = minutes % 525600;
//        int day = remainingMinutes / 1440;
//        System.out.println(minutes + " minutes is approximately " + year + " year(s) and " + day + " day(s).");


        /**
         * Another way to solve this task
         */

        double minutesInYear = 60 * 24 * 365;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        double min = input.nextDouble();
        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;
        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");

    }
}
