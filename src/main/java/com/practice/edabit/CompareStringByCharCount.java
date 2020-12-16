package com.practice.edabit;

public class CompareStringByCharCount {
    public static void main(String[] args) {
        System.out.println(compareStrings("ABC", "CD"));
    }

    public static boolean compareStrings(String str1, String str2){
        return str1.length() == str2.length();
    }
}
