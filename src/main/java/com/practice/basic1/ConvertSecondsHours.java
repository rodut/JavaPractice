/**
 * Write a Java program to convert seconds to hour, minute and seconds.
 * Sample Output:
 * Input seconds: 86399
 * 23:59:59
 */

package com.practice.basic1;

import java.util.Scanner;

public class ConvertSecondsHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
