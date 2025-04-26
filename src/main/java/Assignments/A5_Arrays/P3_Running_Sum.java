package Assignments.A5_Arrays;

// Running Sum of 1d Array (1480) (LeetCode)

// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

// https://leetcode.com/problems/running-sum-of-1d-array/description/

import java.util.Arrays;

public class P3_Running_Sum {
    public static int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];

        arr[0] = nums[0];
        for(int i=1; i<arr.length; i++) {
            arr[i] = nums[i] + arr[i-1];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
