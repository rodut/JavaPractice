package com.practice.edabit;

public class WordCharWord {
    public static void main(String[] args) {
        System.out.println(concatWordCharWord("$", "Java is fun."));
    }

    public static String concatWordCharWord(String c, String str){
        return str.replace(" ", c);
    }
}
