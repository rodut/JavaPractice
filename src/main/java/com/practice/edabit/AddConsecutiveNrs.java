package com.practice.edabit;

public class AddConsecutiveNrs {
    public static void main(String[] args) {
        System.out.println(calcConsecutiveNumbers(10));
    }

    public static int calcConsecutiveNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
