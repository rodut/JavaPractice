package com.practice.edabit;

public class DividesEvenly {
    public static void main(String[] args) {
        System.out.println(dividesEven(85, 4));
    }

    public static boolean dividesEven(int a, int b){
        return a % b == 0;
    }
}
