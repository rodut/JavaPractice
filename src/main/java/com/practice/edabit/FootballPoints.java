package com.practice.edabit;

public class FootballPoints {
    public static void main(String[] args) {
        System.out.println(calculatePointsNumber(1, 0, 0));
    }

    public static int calculatePointsNumber(int wins, int draws, int loses){
        wins *= 3;
        draws *= 1;
        loses *= 0;
        return wins + draws + loses;
    }
}
