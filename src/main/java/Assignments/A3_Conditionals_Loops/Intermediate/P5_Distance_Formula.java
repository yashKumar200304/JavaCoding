// Calculate Distance Between Two Points
package Assignments.A3_Conditionals_Loops.Intermediate;
import java.util.Scanner;

public class P5_Distance_Formula {
    public double distanceFormula(int x1, int x2, int y1, int y2) {
        double result = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        return result;
    }
    
    public static void main(String[] args) {
        P5_Distance_Formula obj = new P5_Distance_Formula();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter coordintes of First point (X1 and Y1) : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter coordintes of Second point (X2 and Y2) : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double distance = obj.distanceFormula(x1, x2, y1, y2);
        System.out.println("Distance : "+distance);
        sc.close();
    }
}
