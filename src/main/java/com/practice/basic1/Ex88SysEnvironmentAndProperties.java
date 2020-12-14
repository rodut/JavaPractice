/**
 * Write a Java program to get the current system environment and system properties.
 */

package com.practice.basic1;

public class Ex88SysEnvironmentAndProperties {
    public static void main(String[] args) {

        System.out.println("Current system environment: ");
        System.out.println(System.getenv());
        System.out.println("Current system properties: ");
        System.out.println(System.getProperties());
    }
}
