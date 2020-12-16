package com.practice.edabit;

public class FlipBoolean {
    public static void main(String[] args) {
        System.out.println(flipTheBoolean(true));
    }

    public static boolean flipTheBoolean(boolean b) {
        if (b) return false;
        if (!b) return true;
        return b;
    }
}
