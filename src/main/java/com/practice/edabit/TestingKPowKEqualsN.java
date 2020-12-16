package com.practice.edabit;

public class TestingKPowKEqualsN {
    public static void main(String[] args) {
        System.out.println(testKPowKEqualsN(387420489, 9));
    }

    public static boolean testKPowKEqualsN(int n, int k){
        return Math.pow(k, k) == n;
    }
}
