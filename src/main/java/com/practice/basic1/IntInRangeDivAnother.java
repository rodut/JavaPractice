/**
 * Write a Java program to find the number of integers within the range of two specified numbers and that are divisible by another number.
 * For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p
 * i.e. { i :x ≤ i ≤ y, i mod p = 0 }
 * Sample Output:
 * 5
 */

package com.practice.basic1;

import java.util.ArrayList;
import java.util.List;

public class IntInRangeDivAnother {
    public static void main(String[] args) {

        int x = 5;
        int y = 20;
        int p = 3;
        System.out.println(result(x,y,p));
    }

    public static int result(int x, int y, int p) {
        if (x%p == 0)
            return( y/p - x/p + 1);
        return(y/p - x/p);
    }

}
