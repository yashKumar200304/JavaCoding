// Input currency in rupees and output in USD.
package Assignments.A2_First_Java;
import java.util.Scanner;

public class P6_Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter currency in Rupee : ");
        double currency = sc.nextDouble();

        // 83.17

        System.out.println("Result in Dollar : "+ (currency/83.17));
        sc.close();
    }
}
