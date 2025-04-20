// Area Of Triangle
package Assignments.A3_Conditionals_Loops.Basic;
import java.util.Scanner;

public class P2_Area_of_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Side : ");
        double side = sc.nextDouble();

        double area = (Math.sqrt(3)*side*side)/4;
        System.out.println("Area of Equilateral Triangle : "+area);
        sc.close();
    }
}
