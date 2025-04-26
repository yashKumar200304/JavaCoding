package Assignments.A4_Functions;

//Given an array of positive integers, the task is to determine if a Pythagorean triplet exists in the given array. A triplet {a, b, c} is considered a Pythagorean triplet if it satisfies the condition a2 + b2 = c2.
//
//        Example:
//
//        Input: arr[] = {3, 1, 4, 6, 5}
//        Output: True
//        Explanation: The array contains a Pythagorean triplet {3, 4, 5}.
//
//
//        Input: arr[] = {10, 4, 6, 12, 5}
//        Output: False
//        Explanation: There is no Pythagorean triplet.
//


import java.util.Scanner;

public class P12_PythagoreanTriplet_Imp {
    public static boolean isPythagoreanTruplet(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                for (int k=j+1; k<n; k++) {
                    int x = arr[i]*arr[i];
                    int y = arr[j]*arr[j];
                    int z = arr[k]*arr[k];

                    if (x==y+z || y==x+z || z==x+y) return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,1,4,6,5};
        System.out.println("Pythogorean Triplet : "+isPythagoreanTruplet(arr));
    }
}
