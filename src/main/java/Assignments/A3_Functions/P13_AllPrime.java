package Assignments.A3_Functions;
// Program to return all prime numbers between 2 given numbers

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P13_AllPrime {
    public static String getAllPrime(int n1, int n2)  {
        if (n1<2 || n2<2) return "\nERROR - Numbers can never be less than 2";
        if (n1>n2) return "\nERROR - First number can never be greater than second number";
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i=n1; i<n2; i++) {
            boolean isPrime = true;
            for (int j=2; j<(int)i*0.5; j++) {
                if (i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) arr.add(i);
        }
        return Arrays.toString(arr.toArray());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Prime numbers b/w "+n1+" and "+n2+" : "+getAllPrime(n1, n2));
    }
}
