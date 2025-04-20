package Assignments.A3_Functions;

import java.util.Scanner;

public class P10_Palindrome {
    public static boolean isPalindrome(int n) {
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum * 10 + r;
            temp /= 10;
        }
        if (sum==n) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Palindrome : "+isPalindrome(n1));
    }
}
