// Area Of Circle Java Program
package Assignments.A3_Conditionals_Loops.Basic;
import java.util.Scanner;

public class P1_Area_of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle : ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle having radius " + radius + " : " + area);
        sc.close(); 
    }
}
