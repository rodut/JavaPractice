package com.javalessons.controlstatement;

public class Controls {
    public static void main(String[] args) {

        int i = 10;

        /**
         * Code block { some code }
         */
        {
            int k = 15;
            System.out.println("i = " + i);
            System.out.println("k = " + k);
        }

        int testScore = 70;
        /**
         * The condition between parentheses is checked and it returns a boolean value (true/false)
         */
        System.out.println("You've got");
        if (testScore > 90) {
            System.out.println("an Excellent");
        } else if (testScore >= 75) {
            System.out.println("a Good");
        } else if (testScore >= 60) {
            System.out.println("a satisfactory");
        } else {
            System.out.println("a bad");
        }
        System.out.println("mark");
    }
}
