package com.practice.edabit;

public class MovieAdmittance {
    public static void main(String[] args) {

    }

    public static boolean acceptIntoMovie(int age, boolean isSupervised){
        return (age >= 15) || isSupervised;
    }
}
