package com.practice.edabit;

public class PowerCalc {
    public static void main(String[] args) {
        System.out.println(calculatePower(230, 10));
    }

    public static int calculatePower(int voltage, int current){
        return voltage * current;
    }
}
