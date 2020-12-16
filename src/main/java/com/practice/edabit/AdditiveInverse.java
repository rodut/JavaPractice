package com.practice.edabit;

import java.util.Arrays;

public class AdditiveInverse {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(returnAdditiveInverse(new int[]{5, -7, 8, 3})));
    }

    public static int[] returnAdditiveInverse(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= -1;
        }
        return arr;
    }
}
