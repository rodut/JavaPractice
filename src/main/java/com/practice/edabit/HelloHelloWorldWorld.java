package com.practice.edabit;

public class HelloHelloWorldWorld {
    public static void main(String[] args) {
        System.out.println(writeHalloWorld(5));
    }

    public static String writeHalloWorld(int num) {
        if ((num % 3 == 0) && (num % 5 == 0)) return "Hello World";
        if (num % 3 == 0) return "Hello";
        if (num % 5 == 0) return "World";
        return null;
    }
}
