/**
 * The Java multidimensional arrays are arranged as an array of arrays i.e. each element of a multi-dimensional array is another array.
 * The representation of the elements is in rows and columns. Thus, you can get a total number of elements in a multidimensional array
 * by multiplying row size with column size.
 */

package com.javalessons.collections.arrays;

import java.security.SecureRandom;

public class Dies {

    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();
        int[] frequency = new int[7];
        for (int i = 0; i < 1000; i++) {
            ++frequency[1 + random.nextInt(6)];
        }

        for (int i = 1; i < frequency.length; i++) {
            System.out.println("Side " + i + " : " + frequency[i]);
        }

//                for (int i : frequency) {
//            System.out.println("Side " + i);
//        }

        multidimensionalArray();
    }

    private static void multidimensionalArray() {
        /**
         *  arr[0][0], arr[0][1], arr[0][2] arr[0][3] arr[0][4]
         *  arr[1][0], arr[1][1], arr[1][2] arr[1][3] arr[1][4]
         *  arr[2][0], arr[2][1], arr[2][2] arr[2][3] arr[2][4]
         *  arr[3][0] arr[3][1] arr[3][2] arr[3][3] arr[3][4]
         *  arr[4][0] arr[4][1] arr[4][2] arr[4][3] arr[4][4]
         */

        int[][] a = {{1, 2},
                {3, 4, 5, 6},
                {7, 8, 9}};

        int[][] b = new int[3][3];

        int[][] c = new int[2][];
        c[0] = new int[2];
        c[1] = new int[4];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
