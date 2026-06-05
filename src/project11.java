/*  Basic Calculator
Write a Java program that simulates a basic calculator. It should perform addition,
subtraction, multiplication, and division based on user input.

 */

import java.util.Scanner;

public class project11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number:");
        double a = input.nextDouble();

        System.out.print("Enter operator ( + , - , *, /):");
        char operator = input.next().charAt(0);

        System.out.print("Enter second number:");
        double b = input.nextDouble();

        switch (operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
        }
    }
}
