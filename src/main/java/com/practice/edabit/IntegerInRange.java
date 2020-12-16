package com.practice.edabit;

public class IntegerInRange {
    public static void main(String[] args) {
        System.out.println(checkIntInRange(3, 1, 9));
    }

    public static boolean checkIntInRange(int n, int lower, int upper) {
        return (lower <= n) && (n < upper);
    }
}
