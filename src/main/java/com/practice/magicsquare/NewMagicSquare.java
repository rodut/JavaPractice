package com.practice.magicsquare;

public class NewMagicSquare {

    static int num = 3;

    public static void main(String[] args) {

        int[][] mat = {{2, 7, 6},
                       {9, 5, 1},
                       {4, 3, 8}};

        if (isMagicSquare(mat)){
            System.out.println("Is a magic square!");
        }else{
            System.out.println("Is not a magic square.");
        }
    }

    static boolean isMagicSquare(int[][] mat) {
        // Calc the sum of the first diagonal
        int sum = 0, sum2 = 0;
        for (int i = 0; i < num; i++) {
            sum += mat[i][i];
        }

        // Calc the sum of the second diagonal
        for (int i = 0; i < num; i++) {
            sum2 += mat[i][num - 1 - i];
        }

        if (sum != sum2) {
            return false;
        }

        // For sums of rows
        for (int i = 0; i < num; i++) {
            int rowSum = 0;
            for (int j = 0; j < num; j++) {
                rowSum += mat[i][j];
            }

            // Check if every row sum is equal to first diagonal sum
            if (rowSum != sum) {
                return false;
            }
        }

        // For sums of columns
        for (int i = 0; i < num; i++) {
            int colSum = 0;
            for (int j = 0; j < num; j++) {
                colSum += mat[j][i];
            }

            // Check if every column sum is equal to first diagonal sum
            if (sum != colSum) {
                return false;
            }
        }
        return true;
    }
}
