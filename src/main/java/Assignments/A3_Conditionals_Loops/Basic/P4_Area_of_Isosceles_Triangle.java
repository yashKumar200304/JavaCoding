// Area Of Isosceles Triangle
package Assignments.A3_Conditionals_Loops.Basic;
import java.util.Scanner;

public class P4_Area_of_Isosceles_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Base : ");
        double base = sc.nextDouble();

        System.out.print("Enter Height : ");
        double height = sc.nextDouble();

        double area = (base*height)/2;
        System.out.println("Area of Isoceles Triangle : "+area);
        sc.close();
    }
}
