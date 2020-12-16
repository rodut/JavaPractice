package com.practice.edabit;

public class TheFarmProblem {
    public static void main(String[] args) {

        System.out.println(calculateLegsNumber(1, 2, 3));
    }

    public static int calculateLegsNumber(int chickens, int cows, int pigs) {
        final int chickenLegs = 2;
        final int cowsLegs = 4;
        final int pigsLegs = 4;
        chickens *= chickenLegs;
        cows *= cowsLegs;
        pigs *= pigsLegs;
        return chickens + cows + pigs;
    }

}
