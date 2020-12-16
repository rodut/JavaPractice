package com.practice.edabit;

public class UsingAndAndOperator {
    public static void main(String[] args) {
        System.out.println(usingAndAndOperator(true, false));
    }

    public static boolean usingAndAndOperator(boolean a, boolean b) {
        if(a == true && b == true) return true;
        else return false;

        // return a && b;

    }
}
