package com.practice.edabit;

public class TriangleArea {
    public static void main(String[] args) {
        int base = 10;
        int height = 10;
        System.out.println(calculateTriangleArea(base, height));
    }

    public static int calculateTriangleArea(int base, int height) {
        return (base * height) / 2;
    }
}
