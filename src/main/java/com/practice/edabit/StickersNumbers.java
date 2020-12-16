package com.practice.edabit;

public class StickersNumbers {
    public static int calcStickers(int n) {
        return (int) Math.pow(n, 2) * 6;
    }

    public static void main(String[] args) {
        System.out.println(calcStickers(3));
    }
}
