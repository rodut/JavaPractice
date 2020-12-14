package com.practice.magicsquare;

public class MagicSquare {
    public static void main(String[] args) {

        // Works only with odd numbers
        int n = 5;
        generateSquare(n);

    }

    private static void generateSquare(int n) {
        int[][] magicSquare = new int[n][n];

        // Initialize position for 1
        int i = n / 2;
        int j = n - 1;

        // Put all the values in magic square one by one
        for (int num = 1; num < n * n; ) {
            if (i == -1 && j == n) {
                j = n - 2;
                i = 0;
            } else {
                if (j == n)
                    j = 0;
                if (i < 0)
                    i = n - 1;
            }
            if (magicSquare[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else
                magicSquare[i][j] = num++;
            j++;
            i--;
        }

        System.out.println("The magic square for " + n + ":");
        System.out.println("Sum of each row and column " + n * (n * n + 1) / 2 + ":");
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print(magicSquare[k][l] + " ");

            }
            System.out.println();
        }
    }
}
