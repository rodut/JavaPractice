package com.practice.edabit;

public class BothZeroNegPos {
    public static void main(String[] args) {
        System.out.println(checkBothNums(0, 0));
    }

    public static boolean checkBothNums(int n1, int n2){
        if(n1 > 0 && n2 > 0) return true;
        if(n1 < 0 && n2 < 0) return true;
        return n1 == 0 && n2 == 0;
    }
}
