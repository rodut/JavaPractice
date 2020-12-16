package com.practice.edabit;

public class CalcUsingString {
    public static void main(String[] args) {
        System.out.println(calculateUsingString(14, 3, "%"));
    }

    public static int calculateUsingString(int num1, int num2, String operation){
        /*
        if(operation.equals("+")) return num1 + num2;
        if(operation.equals("-")) return num1 - num2;
        if(operation.equals("*")) return num1 * num2;
        if(operation.equals("/")) return num1 / num2;
        if(operation.equals("%")) return num1 % num2;
        else return 1; */

        // using switch
        switch (operation){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            case "%":
                return num1 % num2;

        }
        return 1;
    }
}
