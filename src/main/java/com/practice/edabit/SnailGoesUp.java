package com.practice.edabit;

public class SnailGoesUp {
    public static void main(String[] args) {
        System.out.println(calcDistance(0.1, 0.1, 6));
    }

    public static double calcDistance(double height, double length, double tower){
        double steps = tower / height;
        return steps * (height + length);
    }
}
