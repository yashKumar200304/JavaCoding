package Assignments.A3_Functions;

import java.util.Scanner;

public class P1_Max_and_Min {
    public static int Max (int n1, int n2, int n3) {
        int max=n1;
        if (n2>max && n2>n3) max=n2;
        else if (n3>max && n3>n2) max=n3;
        return max;
    }
    public static int Min (int n1, int n2, int n3) {
        int min=n1;
        if (n2<min && n2<n3) min=n2;
        else if (n3<min && n3<n2) min=n3;
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println("Max : "+Max(n1, n2, n3));
        System.out.println("Min : "+Min(n1, n2, n3));
    }
}
