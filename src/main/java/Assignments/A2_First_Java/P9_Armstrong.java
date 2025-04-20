// To find Armstrong Number between two given number.
package Assignments.A2_First_Java;
import java.util.Scanner;

public class P9_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a starting number : ");
        int start = sc.nextInt();

        System.out.print("Enter a starting number : ");
        int end = sc.nextInt();

        System.out.println("Amstrong Number between "+ start + " and "+ end + " : ");

        for (int i = start; i <= end; i++) {
            int temp = i;
            int num = i;
            int numberOfDigits = String.valueOf(temp).length();
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, numberOfDigits);
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num + " ");
            }
        }
        sc.close();
    }
}
