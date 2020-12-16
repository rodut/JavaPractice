package com.practice.edabit;

public class CheckStringSpaces {
    public static boolean checkForSpaces(String str){
        return str.contains(" ");
    }

    public static void main(String[] args) {
        System.out.println(checkForSpaces("Abracadabra"));
    }
}
