package Videos.V6_Condions_Loops;
// Program to count number of digits in a particular number
import java.util.Scanner;

public class P4_Count_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while (n>0) {
            int r = n %10;
            count++;
            n /= 10;
        }
        System.out.println("Number of Digits : "+count);
    }
}
