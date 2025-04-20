package Videos.V8_Arrays;

import java.util.Scanner;

public class P6_Multiple_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
//
//        for (int i = 0; i < 3; i++) {
//            arr.add(new ArrayList<>());
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for(int j=0; j<3; j++) {
//                arr.get(i).add(sc.nextInt());
//            }
//        }
//
//        System.out.println(arr);

        int[][] array = new int[3][3];
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
