package com.practice.edabit;

public class ConvertHoursMinutesInSeconds {
    public static void main(String[] args) {
        System.out.println(convertingHMS(1, 3));
    }

    public static int convertingHMS(int hours, int minutes){
        return (hours * 3600) + (minutes * 60);
    }
}
