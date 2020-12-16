package com.practice.edabit;

public class FramesPerSecond {
    public static void main(String[] args) {
        System.out.println(showingFPS(52, 33));
    }

    public static int showingFPS(int minutes, int fps){
        return minutes * 60 * fps;
    }
}
