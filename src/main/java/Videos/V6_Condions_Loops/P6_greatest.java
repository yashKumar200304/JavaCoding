package Videos.V6_Condions_Loops;
// Largest number among numbers given by the uesr

import java.util.Scanner;

public class P6_greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        int n6 = sc.nextInt();

        System.out.println("Maximum : "+Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, Math.max(n5,n6))))));
    }
}
