package com.practice.edabit;

public class SumArrayElements {
    public static void main(String[] args) {
        System.out.println(calcSumArrayElements(new int[]{-2, 84, 23}));
    }

    public static int calcSumArrayElements(int[] arr) {
        int sum = 0;
        for (int value : arr)
            sum += value;
        return sum;
    }
}
