package Videos.V6_Condions_Loops;

import java.util.Scanner;

// WAP to check the case of a character, i.e. whether is upper case or lower case
public class P2_Upper_Lower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
