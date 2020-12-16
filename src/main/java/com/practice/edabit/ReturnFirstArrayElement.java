package com.practice.edabit;

public class ReturnFirstArrayElement {
    public static void main(String[] args) {
        int[] array = {80, 5, 100};
        System.out.println(returnArraysFirstNr(array));
    }

    public static int returnArraysFirstNr(int[] arr){
        return arr[0];
    }
}
