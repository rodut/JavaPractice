package com.practice.edabit;

public class ReturnSomething {
    public static void main(String[] args) {
        System.out.println(giveMeSomething("is better than nothing"));
    }

    public static String giveMeSomething(String a){
        return "something " + a;
    }
}
