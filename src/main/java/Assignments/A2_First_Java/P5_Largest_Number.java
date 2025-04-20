// Take 2 numbers as input and print the largest number.
package Assignments.A2_First_Java;
import java.util.Scanner;

public class P5_Largest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Second first number : ");
        int num2 = sc.nextInt();

//        if (num1 > num2) {
//            System.out.println("First number is Greatest");
//        }
//
//        else {
//            System.out.println("Second number is Greatest");
//        }

        System.out.println(num1>num2 ? "First Number is Greatest" : "Second Number is Greatest");
        sc.close();
    }
}
