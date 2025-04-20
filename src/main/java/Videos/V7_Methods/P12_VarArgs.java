package Videos.V7_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class P12_VarArgs {
    public static void MyPrint(String ...name) {
        System.out.println(Arrays.toString(name));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyPrint("Yash", "Kumar", "Kataria");
    }
}
