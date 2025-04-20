// Take name as input and print a greeting message for that particular name.
package Assignments.A2_First_Java;
import java.util.Scanner;

public class P2_Greeting_Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        System.out.println("Helloooo "+name);
        sc.close();
    }
}
