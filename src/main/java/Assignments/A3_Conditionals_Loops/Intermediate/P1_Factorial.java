// Factorial Program In Java

package Assignments.A3_Conditionals_Loops.Intermediate;
import java.util.Scanner;

public class P1_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int result = 1;
        int i=1;

        while (i<=num) {
            result *= i;
            i++;
        }

        System.out.println("Factorial of "+num+" : "+result);
        sc.close();
    }    
}
