package com.practice.edabit;

import java.util.Arrays;

public class BoxVolume {
    public static int calcBoxVolume(int[] sizes){
        return sizes[0] * sizes[1] * sizes[2];
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 1};
        System.out.println(calcBoxVolume(array));
    }
}
