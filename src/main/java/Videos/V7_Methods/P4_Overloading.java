package Videos.V7_Methods;

import java.util.Scanner;

public class P4_Overloading {
    public static void Inputs (int n1, int n2, int n3) {
        System.out.println("Three Numbers\nn1 : "+n1+" n2: "+n2+" n3: "+n3);
    }
    public static void Inputs (int n1, int n2) {
        System.out.println("Two Numbers\nn1 : "+n1+" n2: "+n2);
    }
    public static void Inputs (int n1) {
        System.out.println("Single Number\nn1 : "+n1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inputs(20, 30, 40);
        Inputs(20, 30);
        Inputs(20);
    }
}

