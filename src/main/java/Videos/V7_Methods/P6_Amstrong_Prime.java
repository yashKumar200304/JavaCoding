package Videos.V7_Methods;

import java.util.Scanner;

public class P6_Amstrong_Prime {
    public static boolean isAmstrong(int n) {
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int r = temp%10;
            sum = sum + (int) Math.pow(r, 3);
            temp /= 10;
        }
        if (sum == n) return true;
        else return false;
    }

    public static boolean isPrime(int n) {
        if (n<2) return false;
        for (int i=2; i<(int) n*0.5; i++) {
            if (n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Amstrong : "+isAmstrong(153));
        System.out.println("Prime : "+isPrime(17));
    }
}
