/**
 * Write a Java program to input and display your password.
 * Expected Output
 * Input your Password:
 * Your password was: abc@123
 */

package com.practice.basic1;

import java.io.Console;
import java.util.Arrays;

public class ReadPassword {
    public static void main(String[] args) {

        Console console;

        if ((console = System.console()) != null){
            char[] password = null;
            try{
                password = console.readPassword("Input your password: \n");
                System.out.println("Your password is: " + new String(password));
            } finally {
                if(password != null){
                    Arrays.fill(password, ' ');
                }
            }
        } else {
            throw new RuntimeException("No console!");
        }
    }
}
