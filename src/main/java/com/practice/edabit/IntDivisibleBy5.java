package com.practice.edabit;

public class IntDivisibleBy5 {
    public static boolean checkIntDivBy5(int num){
        return num % 5 == 0;
    }

    public static void main(String[] args) {
        System.out.println(checkIntDivBy5(158));
    }
}
