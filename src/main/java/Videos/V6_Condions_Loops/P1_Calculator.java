package Videos.V6_Condions_Loops;
// WAP to create a calculator

import java.util.Scanner;

public class P1_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if (ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%') {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            if (ch=='+') {
                System.out.println("Result : "+(n1+n2));
                return;
            } else if (ch=='-') {
                System.out.println("Result : "+(n1-n2));
                return;
            } else if (ch=='*') {
                System.out.println("Result : "+(n1*n2));
                return;
            } else if (ch=='/') {
                System.out.println("Result : "+(n1/n2));
                return;
            } else if (ch=='%') {
                System.out.println("Result : "+(n1%n2));
                return;
            }
        } else {
            System.out.println(ch+" is Invalid Operator");
        }
    }
}
