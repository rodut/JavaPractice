package com.practice.edabit;

public class CubeSquareRoot {
    public static int calculateCubeSquareRoot(int num){
        return (int) Math.pow(Math.sqrt(num), 3);
    }

    public static void main(String[] args) {
        System.out.println(calculateCubeSquareRoot(695556));
    }
}
