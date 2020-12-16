package com.practice.edabit;

public class WordSingPlur {
    public static boolean checkSingPlur(String word){
        return word.charAt(word.length()-1) == 's';
    }

    public static void main(String[] args) {
        System.out.println(checkSingPlur("girl"));
    }
}
