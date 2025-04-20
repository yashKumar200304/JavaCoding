// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package Assignments.A2_First_Java;
import java.util.Scanner;

public class P3_SImple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount : ");
        int p = sc.nextInt();

        System.out.print("Enter Rate Amount : ");
        int r = sc.nextInt();

        System.out.print("Enter Time Amount : ");
        int t = sc.nextInt();

        float si = (p*r*t)/100;

        System.out.println("Simple Interest : "+si);
        sc.close();
    }
}
