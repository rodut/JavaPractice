package com.javalessons.methods;

public class Methods {
    public static void main(String[] args) {
        printMessage();
        printNextMessage("How are you?");
        printNextMessage("Hope you're well.");
        printName("Bob");
        printName("Mark");

        calcRectangleSquare(9, 9);

        int a = 8;
        int b = 10;
        calcRectangleSquare(a, b);

        int rectangleSquare = calcRectangleSquare2(9, 9);
        System.out.println("Rectangle square = " + rectangleSquare);

        int square = calcSquare(b);
        System.out.println("Square = " + square);
        System.out.println("Sum of squares = " + (rectangleSquare + square)); /* If we will not use (+) it will concatenate strings because there is a string involved*/


    }

    static void printMessage() {
        System.out.println("HW!");
    }

    static void printNextMessage(String message) {
        System.out.println(message);
    }

    static void printName(String name) {
        System.out.println("Hi, " + name);
    }

    static void calcRectangleSquare(int x, int y) {
        int square = x * y;
        System.out.println("Rectangle square" + square);
    }

    static int calcRectangleSquare2(int x, int y) {
        int square = x * y;
        return x * y;
    }

    static int calcSquare(int x) {
        return x * x;
    }

}
