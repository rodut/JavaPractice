package com.practice.edabit;

public class ConvertAgeToDays {
    public static void main(String[] args) {
        int age = 65;
        System.out.println(calcAge(age));
    }

    public static int calcAge(int age){
        return age * 365;
    }
}
