// Write a program to print whether a number is even or odd, also take input from the user.
package Assignments.A2_First_Java;
import java.util.Scanner;

public class P1_Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if(num%2==0) {
            System.out.println(num+" is Even");
        }

        else {
            System.out.println(num+" is Odd");
        }

        sc.close();

    }
}     
