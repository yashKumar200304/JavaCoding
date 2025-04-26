package Assignments.A5_Arrays;

// Shuffle the Array (1470) (LeetCode)
// Return the array in the form [x1,y1,x2,y2,...,xn,yn]

// Input: nums = [2,5,1,3,4,7], n = 3
// Output: [2,3,5,4,1,7]
// Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

// Input: nums = [1,2,3,4,4,3,2,1], n = 4
// Output: [1,4,2,3,3,2,4,1]

// Input: nums = [1,1,2,2], n = 2
// Output: [1,2,1,2]

import java.util.Arrays;

public class P5_Shuffle_Array {
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];

        for (int i=0; i<n; i++) {
            arr[i*2] = nums[i];
            arr[(i*2)+1] = nums[i+n];
        }

        return arr;
    }

    public static void main(String[] args) {
//        int[] nums = {2,5,1,3,4,7};
//        System.out.println(Arrays.toString(shuffle(nums, 3)));
//        int[] nums = {1,2,3,4,4,3,2,1};
//        System.out.println(Arrays.toString(shuffle(nums, 4)));
        int[] nums = {1,1,2,2};
        System.out.println(Arrays.toString(shuffle(nums, 2)));
    }
}
