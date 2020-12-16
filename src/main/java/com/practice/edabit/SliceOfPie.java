package com.practice.edabit;

public class SliceOfPie {
    public static boolean splitThePie(int total, int people, int each){
        if (people == 0) return true;
        else return (people * each) <= total;
    }

    public static void main(String[] args) {
        System.out.println(splitThePie(24, 12, 2));
    }
}
