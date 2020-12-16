package com.practice.edabit;

public class ProfitableGamble {
    public static void main(String[] args) {
        System.out.println(calcIfProfitable(0.2, 50, 9));
    }

    public static boolean calcIfProfitable(double prob, int prize, int pay) {
        return (prob * prize) > pay;
    }
}
