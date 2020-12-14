package com.javalessons.controlstatement;

public class ForLoop {
    public static void main(String[] args) {
        /**
         * Factorial from 1 to 10
         * In the For loop the dev knows how many times...
         */
        int factorialLimit = 10;
        int factorial = 1;
        for (int i = 1; i <= factorialLimit; i++) {
            factorial *= i;
            System.out.println("Factorial = " + factorial);
        }
        System.out.println("Final factorial = " + factorial);
        System.out.println("************************************");

        /**
         *  We can write it another way...
         */

        /*
        for(int i=10; i>=1; i--){
            System.out.println("i = " + i);
        }

         */
        /**
         * We can write the upper commented code like this:
         */
        int i = 10;
        while (i>=1){
            System.out.println("i = " + i);
            i--;
        }
    }

}
