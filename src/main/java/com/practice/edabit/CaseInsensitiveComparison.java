package com.practice.edabit;

public class CaseInsensitiveComparison {
    public static boolean compareStrings(String str1, String str2){
        return str1.toLowerCase().equals(str2.toLowerCase());
    }

    public static void main(String[] args) {
        System.out.println(compareStrings("mask", "MasK"));
    }
}
