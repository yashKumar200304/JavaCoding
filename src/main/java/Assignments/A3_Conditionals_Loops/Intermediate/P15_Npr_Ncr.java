// Find Ncr & Npr

package Assignments.A3_Conditionals_Loops.Intermediate;

import java.util.Scanner;

public class P15_Npr_Ncr {
    public static long factorial(int num) {
        long prod = 1;
        for(int i=2; i<=num; i++) {
            prod *= i;
        }
        return prod;
    }

    public static long nCr (int n, int r) {
        return (factorial(n)/(factorial(r) * factorial(n-r)));
    }

    public static long nPr (int n, int r) {
        return (factorial(n)/factorial(n-r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(nCr(n, r));
        System.out.println(nPr(n, r));
    }
}
