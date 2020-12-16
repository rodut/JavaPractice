package com.practice.edabit;

public class SquaresAndCubes {
    public static boolean calcSquaresCubes(int[] arr){
        return (Math.sqrt(arr[0]) == Math.cbrt(arr[1]));
    }

    public static void main(String[] args) {
        int[] array = {4, 8};
        System.out.println(calcSquaresCubes(array));
    }
}
