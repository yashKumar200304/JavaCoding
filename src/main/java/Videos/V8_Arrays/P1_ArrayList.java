package Videos.V8_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class P1_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(5);

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println(arr);

        arr.add(500);
        arr.add(600);

        System.out.println(arr);

        System.out.println(arr.contains(22));

        arr.remove(3);  // Index


//        Using Loops
        ArrayList<Integer> new_arr = new ArrayList<>(5);
        for (int i=0; i<5; i++) {
            new_arr.add(sc.nextInt());
        }
        for (int i=0; i<5; i++) {
            System.out.println(new_arr.get(i));
        }

    }
}
