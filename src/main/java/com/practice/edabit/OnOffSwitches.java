package com.practice.edabit;

public class OnOffSwitches {
    public static void main(String[] args) {
        System.out.println(checkCombinationsNumber(3));
    }

    public static int checkCombinationsNumber(int n){
        return (int) Math.pow(2, n);
    }
}
