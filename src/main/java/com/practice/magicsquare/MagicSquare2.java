package com.practice.magicsquare;

import java.util.Scanner;

public class MagicSquare2 {
    public static void main(String[] args) {

        int i, j;
        int sumRow, sumColumn, sumDiagonal = 0, sum = 0;
        boolean magic = true;

        int[][] square = new int[5][5];
        Scanner input = new Scanner(System.in);

        // Read number for each cell
        System.out.println("Enter the numbers: ");
        for (i = 0; i < 5; i++)
            for (j = 0; j < 5; j++)
                square[i][j] = input.nextInt();

        // Display square
        System.out.println("Square: ");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(square[i][j] + " ");
            System.out.println();
        }

        // Calculate the sum of the first row
        for (j = 0; j < 5; j++)
            sum += square[0][j];

        // Calculate the sum of second and third row
        for (i = 1; i < 5; i++) {
            sumRow = 0;
            for (j = 0; j < 5; j++)
                sumRow += square[i][j];
            if (sumRow != sum) {
                magic = false;
                break;
            }
        }

        // Calculate the sum of each column
        if (magic) {
            for (j = 0; j < 5; j++) {
                sumColumn = 0;
                for (i = 0; i < 5; i++)
                    sumColumn += square[i][j];
                if (sumColumn != sum) {
                    magic = false;
                    break;
                }
            }
        }

        // Calculate the sum of the first diagonal
        if (magic) {
            for (i = 0; i < 5; i++)
                for (j = 0; j < 5; j++)
                    if (i == j)
                        sumDiagonal += square[i][j];

            if (sumDiagonal != sum) {
                magic = false;
            }
        }

        // Calculate the sum of the second diagonal
        if (magic) {
            sumDiagonal = 0;
            for (i = 0; i < 5; i++)
                for (j = 0; j < 5; j++)
                    if ((i + j) == 2)
                        sumDiagonal += square[i][j];
            if (sumDiagonal != sum) {
                magic = false;
            }
        }

        // Display result
        if (magic)
            System.out.println("It's a magic square!");
        else
            System.out.println("It's not a magic square.");
    }
}
