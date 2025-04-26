package Assignments.A5_Arrays;

// Concatenation of Array (1929) (LeetCode)

// Input: nums = [1,2,1]
// Output: [1,2,1,1,2,1]

//https://leetcode.com/problems/concatenation-of-array/description/

import java.util.Arrays;

public class P2_Concatination_of_Array {
    public static int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2];
        for(int i=0; i<nums.length; i++) {
            arr[i] = nums[i];
            arr[i+nums.length] = nums[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
