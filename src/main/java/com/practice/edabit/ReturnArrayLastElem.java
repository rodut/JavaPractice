package com.practice.edabit;

public class ReturnArrayLastElem {
    private static int returnLastElem(int[] nums) {
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        System.out.println(returnLastElem(new int[]{0}));
    }
}
