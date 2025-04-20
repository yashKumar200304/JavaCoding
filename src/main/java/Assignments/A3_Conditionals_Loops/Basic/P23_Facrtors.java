// Input a number and print all the factors of that number (use loops).
package Assignments.A3_Conditionals_Loops.Basic;
import java.util.Scanner;

public class P23_Facrtors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.println("Factors of "+num+" -");

        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                System.out.print(i+" ");
            }
            i++;
        }
        sc.close();
    }
}
