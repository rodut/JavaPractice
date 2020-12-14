package com.javalessons.controlstatement;

public class WhileDo {
    public static void main(String[] args) {

        /**
         *  We must save an amount of money into a bank account. How many years
         *  we must save the money to get to the right amount. Bank is also paying
         *  us an interest of 10% yearly.
         */
        int finalBalance = 100000;
        double currentBalance = 0.0;
        int yearlyDeposit = 1000;
        int years = 0;
        double interestRate = 0.1;

/*        while (currentBalance < finalBalance) {
           currentBalance += yearlyDeposit;
           currentBalance = currentBalance + currentBalance * interestRate;
           years++;
           System.out.println("Year " + years + " - " + currentBalance);
        }
 */

        do {
            currentBalance += yearlyDeposit;
            currentBalance = currentBalance + currentBalance * interestRate;
            years++;
            System.out.println("Year " + years + " - " + currentBalance);
        } while (currentBalance < finalBalance && years < 15);
    }
}
