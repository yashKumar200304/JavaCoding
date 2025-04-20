// To find out whether the given String is Palindrome or not.
package Assignments.A2_First_Java;
import java.util.Scanner;

public class P8_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string : ");
        String str = sc.next();
        str = str.toLowerCase();

        if (str.equals(new StringBuilder(str).reverse().toString())) {
            System.out.println("String is Palindrome");
        }

        else {
            System.out.println("String is not Palindrome");
        }
        sc.close();
    }
}
