// Calculate Average Of N Numbers

package Assignments.A3_Conditionals_Loops.Intermediate;
import java.util.Scanner;

public abstract class P3_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of values : ");
        int n = sc.nextInt();
        double avg = 0;
        double sum = 0;
        int i=1;
        while(i<=n) {
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            sum += num;
            if (i==n) {
                avg = sum / i;
            }
            i++;
        }
        System.out.print("Average : "+avg);
        sc.close();
    }
}
