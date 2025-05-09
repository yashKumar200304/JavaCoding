package Assignments.A5_Arrays;

// Kids With the Greatest Number of Candies (1431) (LeetCode)

// Input: candies = [2,3,5,1,3], extraCandies = 3
// Output: [true,true,true,false,true]
// Explanation: If you give all extraCandies to:
//      - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
//      - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
//      - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
//      - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
//      - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

// Input: candies = [4,2,1,1,2], extraCandies = 1
// Output: [true,false,false,false,false]
// Explanation: There is only 1 extra candy.
//      - Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.

import java.util.ArrayList;
import java.util.List;

public class P6_Greatest_Candies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int i=0; i<candies.length; i++) {
            max = Math.max(max, candies[i]);
        }

        for (int i=0; i<candies.length; i++) {
            result.add((candies[i]+extraCandies) >= max);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
