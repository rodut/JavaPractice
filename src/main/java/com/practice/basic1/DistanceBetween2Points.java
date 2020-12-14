/**
 * Write a Java program to compute the distance between two points on the surface of earth.
 * Distance between the two points [ (x1,y1) & (x2,y2)]
 * d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
 * Radius of the earth r = 6371.01 Kilometers
 * Input Data:
 * Input the latitude of coordinate 1: 25
 * Input the longitude of coordinate 1: 35
 * Input the latitude of coordinate 2: 35.5
 * Input the longitude of coordinate 2: 25.5
 * Expected Output
 * The distance between those points is: 1480.0848451069087 km
 */

package com.practice.basic1;

import java.util.Scanner;

public class DistanceBetween2Points {
    private static final double RADIUS = 6371.01;

    //    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input the latitude of coordinate 1: ");
//        double firstLatitude = scanner.nextDouble();
//        firstLatitude = Math.toRadians(firstLatitude);
//        System.out.println("Input the longitude of coordinate 1: ");
//        double firstLongitude = scanner.nextDouble();
//        firstLongitude = Math.toRadians(firstLongitude);
//        System.out.println("Input the latitude of coordinate 2: ");
//        double secondLatitude = scanner.nextDouble();
//        secondLatitude = Math.toRadians(secondLatitude);
//        System.out.println("Input the longitude of coordinate 2: ");
//        double secondLongitude = scanner.nextDouble();
//        secondLongitude = Math.toRadians(secondLongitude);
//        double distance = RADIUS * Math.acos(Math.sin(firstLatitude) * Math.sin(secondLatitude) +
//                Math.cos(firstLatitude) * Math.cos(secondLatitude) * Math.cos(firstLongitude - secondLongitude));
//        System.out.println("The distance between those points is: " + distance + " km.");
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the latitude of coordinate 1: ");
        double lat1 = scanner.nextDouble();
        System.out.println("Input the longitude of coordinate 1: ");
        double lon1 = scanner.nextDouble();
        System.out.println("Input the latitude of coordinate 2: ");
        double lat2 = scanner.nextDouble();
        System.out.println("Input the longitude of coordinate 2: ");
        double lon2 = scanner.nextDouble();

        System.out.println("The distance between those points is: " + distanceBetweenTwoPoints(lat1, lon1, lat2, lon2) + " km.");
    }

    public static double distanceBetweenTwoPoints(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        return RADIUS * Math.acos(Math.sin(lat1) * Math.sin(lat2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }
}
