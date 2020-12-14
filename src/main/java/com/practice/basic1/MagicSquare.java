package com.practice.basic1;

public class MagicSquare {
    public static void main(String[] args) {

        int[][] magicSquare = {
                {19, 26, 3, 10, 17},
                {25, 7, 9, 16, 18},
                {6, 8, 15, 22, 24},
                {12, 14, 21, 23, 5},
                {13, 20, 27, 4, 11}
        };

        /**
         *  arr[0][0], arr[0][1], arr[0][2] arr[0][3] arr[0][4]
         *  arr[1][0], arr[1][1], arr[1][2] arr[1][3] arr[1][4]
         *  arr[2][0], arr[2][1], arr[2][2] arr[2][3] arr[2][4]
         *  arr[3][0] arr[3][1] arr[3][2] arr[3][3] arr[3][4]
         *  arr[4][0] arr[4][1] arr[4][2] arr[4][3] arr[4][4]
         */

        int sumFirstRow = magicSquare[0][0] + magicSquare[0][1] + magicSquare[0][2] + magicSquare[0][3] + magicSquare[0][4];
        int sumSecondRow = magicSquare[1][0] + magicSquare[1][1] + magicSquare[1][2] + magicSquare[1][3] + magicSquare[1][4];
        int sumThirdRow = magicSquare[2][0] + magicSquare[2][1] + magicSquare[2][2] + magicSquare[2][3] + magicSquare[2][4];
        int sumFourthRow = magicSquare[3][0] + magicSquare[3][1] + magicSquare[3][2] + magicSquare[3][3] + magicSquare[3][4];
        int sumFifthRow = magicSquare[4][0] + magicSquare[4][1] + magicSquare[4][2] + magicSquare[4][3] + magicSquare[4][4];

        int sumFirstColumn = magicSquare[0][0] + magicSquare[1][0] + magicSquare[2][0] + magicSquare[3][0] + magicSquare[4][0];
        int sumSecondColumn = magicSquare[0][1] + magicSquare[1][1] + magicSquare[2][1] + magicSquare[3][1] + magicSquare[4][1];
        int sumThirdColumn = magicSquare[0][2] + magicSquare[1][2] + magicSquare[2][2] + magicSquare[3][2] + magicSquare[4][2];
        int sumFourthColumn = magicSquare[0][3] + magicSquare[1][3] + magicSquare[2][3] + magicSquare[3][3] + magicSquare[4][3];
        int sumFifthColumn = magicSquare[0][4] + magicSquare[1][4] + magicSquare[2][4] + magicSquare[3][4] + magicSquare[4][4];

        int firstDiagonal = magicSquare[0][0]+magicSquare[1][1]+magicSquare[2][2]+magicSquare[3][3]+magicSquare[4][4];
        int secondDiagonal = magicSquare[4][0]+magicSquare[3][1]+magicSquare[2][2]+magicSquare[1][3]+magicSquare[0][4];


    }
}
