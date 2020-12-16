package com.practice.edabit;

public class ToThePowerOf__ {
    public static void main(String[] args) {
        System.out.println(calcToPower(5, 5));
    }

    public static int calcToPower(int num, int exp){
        return (int) Math.pow(num, exp);
    }
}
