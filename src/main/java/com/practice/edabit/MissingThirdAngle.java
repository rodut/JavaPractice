package com.practice.edabit;

public class MissingThirdAngle {
    public static String calcMissingAngle(int angle1, int angle2){
        int angle = 180 - angle1 - angle2;
        if (angle < 90) return "acute";
        if (angle > 90) return "obtuse";
        else return "right";
    }

    public static void main(String[] args) {
        System.out.println(calcMissingAngle(135, 11));
    }
}
