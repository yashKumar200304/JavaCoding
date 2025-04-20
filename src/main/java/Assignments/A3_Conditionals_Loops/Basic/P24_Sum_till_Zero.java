// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
package Assignments.A3_Conditionals_Loops.Basic;
import java.util.Scanner;

public class P24_Sum_till_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press '0' to terminate Program");

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int sum = 0;
    
        while (num != 0) {
            sum += num;
            System.out.print("Enter a number : ");
            num = sc.nextInt();
        }

        System.out.println("Sum of all numbers you enterd : "+sum);
        sc.close();
    }    
}
