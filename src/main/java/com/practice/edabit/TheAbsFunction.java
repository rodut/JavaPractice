package com.practice.edabit;

public class TheAbsFunction {
    public static void main(String[] args) {
        System.out.println(createAbsFunction(-544));
    }

    public static double createAbsFunction(double n){
        if (n>0)
            return n;
        if (n<0)
            return -n;
        else return 0;
    }
}
