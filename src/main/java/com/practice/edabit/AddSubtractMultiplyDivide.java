package com.practice.edabit;

public class AddSubtractMultiplyDivide {
    public static String checkOperation(int num1, int num2){
        if (num1 + num2 == 24) return "added";
        if (num1 - num2 == 24) return "subtracted";
        if (num1 * num2 == 24) return "multiplied";
        if (num1 / num2 == 24) return "divided";
        else return "none";
    }

    public static void main(String[] args) {
        System.out.println(checkOperation(26, 2));
    }
}
