// Subtract the Product and Sum of Digits of an Integer (LeetCode)
package Assignments.A3_Conditionals_Loops.Basic;
import java.util.Scanner;

// public class q22 {
//     public int sumOfDigits (int num) {
//         int sum = 0;
//         while(num > 0) {
//             int remainder = num % 10;
//             sum += remainder;
//             num = num / 10;
//         }
//         return sum;
//     }

//     public int productOfDigits (int num) {
//         int product = 1;
//         while(num > 0) {
//             int remainder = num % 10;
//             product *= remainder;
//             num = num / 10;
//         }
//         return product;
//     }

//     public static void main(String[] args) {
//         q22 obj = new q22();
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a number : ");
//         int num = sc.nextInt();

//         int sum = obj.sumOfDigits(num);
//         int product = obj.productOfDigits(num);

//         System.out.println("Sum of Digits : "+sum);
//         System.out.println("Sum of Product : "+product+"\n");

//         System.out.println("Difference of Product and Sum : "+(product-sum));
//         sc.close();
//     }
// }



// ------------------------------------------------------

public class P22_Product_Sum {
    public int productMinusSum(int num) {
        int sum = 0;
        int product = 1;

        while (num > 0) {
            int remainder = num % 10;
            sum += remainder;
            product *= remainder;
            num /= 10;
        }

        System.out.println("Sum of Numbers : "+ sum);
        System.out.println("Product of Numbers : "+ product);

        return (product-sum);
    }

    public static void main(String[] args) {
        P22_Product_Sum obj = new P22_Product_Sum();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int result = obj.productMinusSum(num);
        System.out.println("Product - Sum : " + result);
        sc.close();
    }
}
