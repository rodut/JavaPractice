package com.practice.edabit;

public class LeapYear {
    public static boolean findLeapYear(int year){
        if (year % 400 == 0) return true;
        return (year % 4 == 0) && (year % 100 != 0);
    }

    public static void main(String[] args) {
        System.out.println(findLeapYear(2019));
    }
}
