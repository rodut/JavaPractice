package com.practice.edabit;

import java.util.Arrays;
import java.util.Collections;

public class MaxDiffArrayNrs {
    public static int calcDiff(Integer[] arr) {
        int min = Collections.min(Arrays.asList(arr));
        int max = Collections.max(Arrays.asList(arr));
        return max - min;
    }

    public static int calcDiffSort(int[] nums){
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        return max - min;
    }

    public static void main(String[] args) {
        Integer[] firstArray = {10, 15, 20, 2, 10, 6};
        int[] secondArray = {-3, 4, -9, -1, -2, 15};
        System.out.println(calcDiff(firstArray));
        System.out.println(calcDiffSort(secondArray));
    }
}
