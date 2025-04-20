// To calculate Fibonacci Series up to n numbers.
package Assignments.A2_First_Java;
import java.util.Scanner;

public class P7_Fibonacc {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int limit = sc.nextInt();

    int num1 = 0;
    int num2 = 1;

//    System.out.print(num1 + " "+ num2 + " ");
//
//    int i = 2;
//    while (i < limit) {
//      int num3 = num1 + num2;
//
//      num1 = num2;
//      num2 = num3;
//      System.out.print(num3 + " ");
//
//      i++;
//    }

    System.out.print(0+" "+1+" ");
    for (int i=2;  i<limit; i++) {
      int temp = num1+num2;
      num1 = num2;
      num2 = temp;
      System.out.print(num2+(i!=limit-1 ? " ": ""));
    }
    sc.close();
  }
}
