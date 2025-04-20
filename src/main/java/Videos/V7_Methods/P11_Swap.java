package Videos.V7_Methods;

import java.util.Scanner;

public class P11_Swap {
    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 10;
        int n2 = 20;
        System.out.println("Before Swapping : \n"+"n1 : "+n1+" n2 : "+n2);
//        This will not work because values are changing in fucntion's scope only
        swap(n1, n2);
        System.out.println("After Swapping : \n"+"n1 : "+n1+" n2 : "+n2);
    }
}
