package com.practice.edabit;

public class NameGreeting {
    public static void main(String[] args) {
        String name = "Bob";
        System.out.println(writeGreeting(name));
    }

    public static String writeGreeting(String name){
        return "Hello " + name + "!";
    }
}
