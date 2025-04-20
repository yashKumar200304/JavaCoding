package Videos.V7_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class P1_Change_First_Value {
    public static int[] changeFirstValue (int[] arr) {
        arr[0] = 69;
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60};
        int[] result = changeFirstValue(arr);
        System.out.println(Arrays.toString(result));
    }
}
