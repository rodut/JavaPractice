package com.practice.edabit;

public class NumberEvenOdd {
    public static String checkEvenOdd(int num){
        if (num % 2 == 0) return "even";
        else return "odd";
    }

    public static void main(String[] args) {
        System.out.println(checkEvenOdd(19));
    }
}
