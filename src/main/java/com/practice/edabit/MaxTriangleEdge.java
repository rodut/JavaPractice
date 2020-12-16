package com.practice.edabit;

public class MaxTriangleEdge {
    public static void main(String[] args) {
        int firstSide = 8;
        int secondSide = 10;
        System.out.println(calcMaxEdge(firstSide, secondSide));
    }

    public static int calcMaxEdge(int side1, int side2) {
        return (side1 + side2) - 1;
    }
}
