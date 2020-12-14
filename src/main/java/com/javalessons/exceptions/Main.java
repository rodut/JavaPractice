/**
 * An exception it's a situation when the program works not as designed, invalid data, network problems, file problems, etc.
 * It can be handled in two ways:
 * Termination model - stops the running of the block of program where the exception was caught, then go to the exception handling block of code.
 * Resumption model - continue execution after the exception is handled. It's not popular in Java.
 * There are checked and unchecked exceptions:
 * Unchecked exception appears when the code is bad (Runtime exception).
 * IO exceptions are checked exceptions.
 */

package com.javalessons.exceptions;

import java.io.*;
import java.rmi.server.ExportException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            doEverything();
        } catch (InvalidInputParamException e) {
            System.out.println("InvalidInputParamException");
            e.printStackTrace();
        }
    }

    private static void doEverything() {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try (PrintWriter writer = new PrintWriter(new FileWriter("out.txt"));
                 BufferedReader reader = new BufferedReader(new FileReader("12345678"))) {
                System.out.println("Enter numerator: ");
                int numerator = scanner.nextInt();
                System.out.println("Enter denominator: ");
                int denominator = scanner.nextInt();
//                System.out.println(divide(numerator, denominator));

//                int[] intArray = new int[1];
//                int i = intArray[2];

                writer.println("Result = " + divide(numerator, denominator));
                continueLoop = false;

            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception: " + e);
                scanner.nextLine();
                System.out.println("Only integer non-zero parameters allowed.");
            } catch (IOException e) {
                System.out.println("Unable to open file.");
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("All exceptions are catched here.");
                throw new InvalidInputParamException("Index out of bound. Thrown in doEverything " + e);
            } finally {
                System.out.println("Finally block was called.");
            }
            System.out.println("Try/catch block is finished.");
        } while (continueLoop);
    }

    /**
     * Division to zero
     */
    private static int divide(int numerator, int denominator) throws ArithmeticException, NullPointerException {
        return numerator / denominator;
    }

    private static void saveToFile(int result) throws IOException {

        /**
         *  PrintWriter will save the result into a file
         */
        PrintWriter writer = new PrintWriter(new FileWriter("out.txt"));
        writer.println("Result = " + result);
        writer.close();
    }
}
