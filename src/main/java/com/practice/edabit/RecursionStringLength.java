package com.practice.edabit;

public class RecursionStringLength {
    public static void main(String[] args) {
        System.out.println(calcStringLength("shipment"));
    }

    public static int calcStringLength(String str) {
        //return str.length();

        // with recursion
        if (str.equals("")) {
            return 0;
        } else {
            return calcStringLength(str.substring(1)) + 1;
        }
    }
}
