package com.practice.edabit;

import java.util.Arrays;

public class PairManagement {
    public static int[] managePair(int a, int b){
        return new int[] {a, b};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(managePair(1, 2)));
    }
}
