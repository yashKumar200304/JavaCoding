package Assignments.A5_Arrays;

// Richest Customer Wealth (1672) (LeetCode)

// Input: accounts = [[1,2,3],[3,2,1]]
// Output: 6
// Explanation:
//      1st customer has wealth = 1 + 2 + 3 = 6
//      2nd customer has wealth = 3 + 2 + 1 = 6
//      Both customers are considered the richest with a wealth of 6 each, so return 6.

// Input: accounts = [[1,5],[7,3],[3,5]]
// Output: 10

// Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
// Output: 17

// https://leetcode.com/problems/richest-customer-wealth/description/

import java.util.Arrays;

public class P4_Richest_Customer {
    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for(int i=0; i<accounts.length; i++) {
            int sum = 0;
            for (int j=0; j<accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > max) max = sum;
        }
        return max;
    }

    public static void main(String[] args) {
//        int[][] accounts = {{1,2,3},{3,2,1}};
//        int[][] accounts = {{1,5},{7,3},{3,5}};
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }
}
