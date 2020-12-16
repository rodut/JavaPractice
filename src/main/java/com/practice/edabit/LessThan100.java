package com.practice.edabit;

public class LessThan100 {
    public static void main(String[] args) {
        System.out.println(calcIfLess(33, 77));
    }

    public static boolean calcIfLess(int a, int b){
        return (a + b) < 100;
    }
}
