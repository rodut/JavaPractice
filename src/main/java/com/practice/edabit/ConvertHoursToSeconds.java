package com.practice.edabit;

public class ConvertHoursToSeconds {
    public static void main(String[] args) {
        int numberOfHours = 2;
        System.out.println(howManySeconds(numberOfHours));
    }
    public static int howManySeconds(int hours){
        return hours * 3600;
    }
}
