/**
 * Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME.
 */

package com.practice.basic1;

public class Ex90GetEnvVariable {
    public static void main(String[] args) {

        System.out.println("Environment variable PATH: " + System.getenv("PATH"));
        System.out.println("Environment variable TEMP: " + System.getenv("TEMP"));
        System.out.println("Environment variable USERNAME: " + System.getenv("USERNAME"));
    }
}
