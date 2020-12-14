/**
 * Write a Java program to display the system time.
 * Sample Output:
 * Current Date time: Fri Jun 16 14:17:40 IST 2017
 */

package com.practice.basic1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SystemCurrentTime {

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + dateTimeFormatter.format(now));
    }
}
