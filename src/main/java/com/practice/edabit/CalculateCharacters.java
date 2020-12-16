package com.practice.edabit;

public class CalculateCharacters {
    public static void main(String[] args) {
        System.out.println(calculateNumberOfCharacters(new String[]{"", ""}));
    }

    public static int calculateNumberOfCharacters(String[] arr){
        int total = 0;
        for (String element : arr) {
            total += element.length();
        }
        return total;
    }
}
