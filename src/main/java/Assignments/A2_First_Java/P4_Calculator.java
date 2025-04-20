// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package Assignments.A2_First_Java;
import java.util.Scanner;

public class P4_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();

        System.out.println("\n1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /\n");

        System.out.println("Choose an Operator : ");
        char choice = sc.next().charAt(0);

        if (choice == '+') {
            System.out.println("Result (+) : "+ (num1+num2));
        }
        else if (choice == '-') {
            System.out.println("Result (-) : "+ (num1-num2));
        }
        else if (choice == '*') {
            System.out.println("Result (*) : "+ (num1*num2));
        }
        else if (choice == '/') {
            System.out.println("Result (/) : "+ (num1/num2));
        }
        else {
            System.out.println("Wrong Choice");
        }
        sc.close();
    }
}
