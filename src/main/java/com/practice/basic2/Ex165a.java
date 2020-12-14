/**
 * Write a Java program to move every positive number to the right and every negative number to the left of a given array of integers.
 * Expected Output:
 * Original array: [-2, 3, 4, -1, -3, 1, 2, -4, 0]
 * Result: [-4, -3, -2, -1, 0, 1, 2, 3, 4]
 */

package com.practice.basic2;

public class Ex165a {
    int[] arr;

    public static void main(String[] args) {

        int[] myArray = {-2, 3, 4, -1, -3, 1, 2, -4, 0};
        Ex165a r = new Ex165a(myArray);
        System.out.print("Original array: ");
        r.display();
        r.divideGroups(0, myArray.length -1);
        System.out.println("");
        System.out.print("Rearranged array: ");
        r.display();
    }

    public Ex165a(int[] arr) {
        this.arr = arr;
    }

    private void reverse(int x, int y) {
        while (y > x) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
            x++;
            y--;
        }
    }

    private void display() {
        for (int value : arr) {
            System.out.print(" " + value);
        }
    }

    private void divideGroups(int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        divideGroups(low, mid);
        divideGroups(mid + 1, high);
        merge(low, mid, high);
    }

    private void merge(int low, int mid, int high) {
        int l = low;
        int k = mid + 1;
        while (l <= mid && arr[l] <= 0)
            l++;
        while (k <= high && arr[k] <= 0)
            k++;
        reverse(l, mid);
        reverse(mid + 1, k - 1);
        reverse(l, k - 1);
    }

}
