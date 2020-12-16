package com.practice.edabit;

public class EmptyString {
    public static void main(String[] args) {
        System.out.println(checkEmptyString(""));
    }

    public static boolean checkEmptyString(String str){
        return str.isEmpty();

    }
}
