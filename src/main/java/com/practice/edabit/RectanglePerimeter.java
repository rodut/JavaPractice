package com.practice.edabit;

public class RectanglePerimeter {
    public static void main(String[] args) {
        System.out.println(calculateRectanglePerimeter(2, 9));
    }

    public static int calculateRectanglePerimeter(int length, int width) {
        return (length + width) * 2;
    }
}
