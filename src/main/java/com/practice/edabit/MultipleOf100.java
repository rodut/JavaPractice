package com.practice.edabit;

public class MultipleOf100 {
    public static void main(String[] args) {
        System.out.println(calcDivisibleBy100(1900));
    }

    public static boolean calcDivisibleBy100(int a) {
        return (a % 100 == 0);
    }
}
