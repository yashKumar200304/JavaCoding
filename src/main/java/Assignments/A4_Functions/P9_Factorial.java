package Assignments.A4_Functions;

import java.util.Scanner;

public class P9_Factorial {
    public static int fact(int n) {
        if (n==0 || n==1) return 1;
        int result = 1;
        for(int i=n; i>=1; i--) {
            result = n * fact(n-1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Factorial : "+fact(n));
    }
}
