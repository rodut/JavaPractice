/**
 * Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds),
 * and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
 * Test Data
 * Input distance in meters: 2500
 * Input hour: 5
 * Input minutes: 56
 * Input seconds: 23
 * Expected Output :
 * Your speed in meters/second is 0.11691531
 * Your speed in km/h is 0.42089513
 * Your speed in miles/h is 0.26158804
 */
package com.practice.datatypes;

import java.util.Scanner;

public class Ex7DistanceSpeed {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        int distance = scanner.nextInt();
        System.out.print("Input hour: ");
        int hours = scanner.nextInt();
        System.out.print("Input minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Input seconds: ");
        int seconds = scanner.nextInt();
        scanner.close();

        int timeSeconds = hours * 3600 + minutes * 60 + seconds;
        double avgSpeedMeterSeconds = (double) distance / timeSeconds;
        double avgSpeedKmH = (double) (distance * 3600) / (timeSeconds * 1000);
        double avgSpeedMilesH = (double)  (distance * 3600 / 1.609) / (timeSeconds * 1000);
        System.out.println("Your speed in meters/second is " + avgSpeedMeterSeconds);
        System.out.println("Your speed in km/h is "+ avgSpeedKmH);
        System.out.println("Your speed in miles/h is " +avgSpeedMilesH);


    }
}
