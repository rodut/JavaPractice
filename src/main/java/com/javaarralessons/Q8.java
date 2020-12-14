package com.javaarralessons;

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {

        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {10, 9, 8, 7, 6};
        mergingInAscendingOrder(firstArray, secondArray);
    }

    public static void mergingInAscendingOrder(int[] a, int[] b){
        int firstArrayLength = a.length;
        int secondArrayLength = b.length;
        int[] c = new int[firstArrayLength + secondArrayLength];
        System.arraycopy(a, 0, c, 0, firstArrayLength);
        System.arraycopy(b, 0, c, firstArrayLength, secondArrayLength);
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
}