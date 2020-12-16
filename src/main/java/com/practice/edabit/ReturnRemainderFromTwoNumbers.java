package com.practice.edabit;

public class ReturnRemainderFromTwoNumbers {
    public static void main(String[] args) {
        int firstNum = -9;
        int secondNum = 45;
        System.out.println(returnRemainder(firstNum, secondNum));

    }

    public static int returnRemainder(int firstNumber, int secondNumber) {
        return firstNumber % secondNumber;
    }
}
