// Reverse A String In Java
package Assignments.A3_Conditionals_Loops.Intermediate;
import java.util.Scanner;

public class P16_Reverse_of_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        StringBuilder str = new StringBuilder(sc.next());
//        System.out.println(str.reverse());

        char[] arr = sc.next().toCharArray();
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(String.valueOf(arr));
    }
}
