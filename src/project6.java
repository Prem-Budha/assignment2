/* Logical Operators Check
Write a Java program that takes three numbers as input and checks whether the third
number is the sum of the first two numbers, using logical operators.

 */

import java.util.Scanner;

public class project6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.print("Enter third number: ");
        int c = input.nextInt();

        if (a < c && b < c) {
            if ( a+b ==c ) {
                System.out.println("Yes third number is the sum of first and second numbers");
            }
            else{
                System.out.println("NO third number is not the sum of first and second numbers");
            }
        }
        else{
            System.out.println("Your entered number is not less than third number.");
        }
    }
}
