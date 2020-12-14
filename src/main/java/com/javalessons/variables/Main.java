package com.javalessons.variables;

public class Main {

    public static void main(String[] args) {

        byte b = 10;
        short c = 200;
        int a = b + 23;
        long myLongValue = 123456789876L;

        float myFloatValue = 23.56f;
        double myDoubleValue = 54.45;

        double sum = a + b + c + myLongValue + myDoubleValue + myFloatValue;
        System.out.println("Sum = " + sum);

        char char1 = 'A';
        /**
         * To copy a row - CTRL + D
         */
        char char2 = 'B';
        char char3 = '\n';
        char char4 = '^';

        System.out.println("Characters:");
        System.out.println("Char1: " + char1);
        System.out.println("Char2: " + char2);
        System.out.println("Char3: " + char3);
        System.out.println("Char4: " + char4);
        System.out.println("Sum of chars: " + char1 + char2 + char3 + char4);
        System.out.println("-----------------");
        System.out.println("Sum of chars: ");
        System.out.println(char1 + char2 + char3 + char4);

        boolean b1 = true;
        /**
         * Boolean is by default FALSE
         */
        boolean b2;

        /**
         * String - one of non-primitive type
         */
        String string = "some string" + " some other string";
        System.out.println(string);

        /**
         * Casting
         */
        short someShort = b;
        int someInt = someShort;

        /**
         * Cannot do like this, int is bigger than short
         * someShort = someInt;
         */

        /**
         * But we can cast it like this
         */
        someShort = (short) someInt;

        /**
         * Be careful with casting
         */
        someInt = (int) myLongValue;

        System.out.println("Some int: " + someInt);
        System.out.println("Some short: " + someShort);

        double someIntToDouble = someInt;

        System.out.println("Some int to double: " +  someIntToDouble);

    }
}
