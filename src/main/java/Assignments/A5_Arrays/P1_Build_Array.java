package Assignments.A5_Arrays;

// Build array from permutation (1920) (LeetCode)
// ans[i] = nums[nums[i]]

// Input: nums = [0,2,1,5,3,4]
// Output: [0,1,2,4,5,3]

// https://leetcode.com/problems/build-array-from-permutation/description/

import java.util.Arrays;
import java.util.Scanner;

public class P1_Build_Array {
    public static int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i=0; i<arr.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}
