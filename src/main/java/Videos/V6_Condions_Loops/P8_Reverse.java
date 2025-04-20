package Videos.V6_Condions_Loops;

import java.util.Scanner;

public class P8_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        while (n>0) {
            int r = n%10;
            result = result * 10 + r;
            n /= 10;
        }
        System.out.println("result : "+result);
    }
}
