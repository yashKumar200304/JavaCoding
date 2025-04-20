// ake integer inputs till the user enters 0 and print the largest number from all.
package Assignments.A3_Conditionals_Loops.Basic;
import java.util.Scanner;

public class P25_Largest_till_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press '0' to terminate Program");

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int greatest = Integer.MIN_VALUE;
    
        while (num != 0) {
            if (num > greatest) {
                greatest = num;
            }

            System.out.print("Enter a number : ");
            num = sc.nextInt();
        }

        System.out.println("Greatest of all numbers you enterd : "+ greatest);
        sc.close();
    } 
}
