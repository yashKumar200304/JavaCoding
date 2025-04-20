package Assignments.A3_Functions;

import java.util.Scanner;

// Program to calculate sum of first n natural numbers
public class P14_Sum_Natural {
    public static int sumOfNatural(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Sum of first "+n+" natural numbers : "+sumOfNatural(n));
    }
}
