// Armstrong Number In Java
package Assignments.A3_Conditionals_Loops.Intermediate;
import java.util.Scanner;

public class P14_Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int temp = n;
        while (temp > 0) {
            int r = temp % 10;
            result = result + (int) Math.pow(r, String.valueOf(n).length());
            temp /= 10;
        }
        if (result == n)
            System.out.println(n + " is an Amstrong number");
        else
            System.out.println(n + " is not an Amstrong number");
    }
}
