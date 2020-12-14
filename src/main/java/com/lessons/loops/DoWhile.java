/**
 * Do-While loop e similar cu While dar are o diferenta importanta: do-while executa o testare dupa fiecare executie a loop corpului.
 */

package com.lessons.loops;

import java.util.Scanner;

public class DoWhile {

    // Add numbers
    public static void main(String[] args) {
        int value, sum = 0;
        char choice;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter integer: ");
            value = scanner.nextInt();
            sum += value;
            System.out.print("Enter Y for yes and N for no: ");
            choice = scanner.next().charAt(0);
        } while ((choice == 'y') || (choice == 'Y'));

        System.out.println("The sum of integers: " + sum);


        // Guess my number
        int num, guess;

        // Get random number between 1 and 100
        num = (int) (Math.random() * 10) + 1;

        do {
            System.out.print("Enter an integer between 1 and 10: ");
            guess = scanner.nextInt();

            if (guess == num) {
                System.out.println("You guessed the correct number.");
            }else if (guess<num){
                System.out.println("Your guess is lower than the number. \nGuess again!");
            }else {
                System.out.println("Your guess is higher than the number. \nGuess again!");
            }
        }while (guess != num);
    }
}
