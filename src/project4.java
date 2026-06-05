/*Fibonacci Series
Write a Java program to print the first “n” numbers of the Fibonacci series. */

import java.util.Scanner;

public class project4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter term:");
        int term = input.nextInt();

        int a = 0 , b = 1;

        for (int i = 1; i <= term; i++) {
            System.out.print( a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}
