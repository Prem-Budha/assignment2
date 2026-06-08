/*Multiplication Table
Write a Java program that prints the multiplication table of a given number up to 10.

 */

import java.util.Scanner;

public class project7 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.print("Enter  a number:");
        int num = input.nextInt();

        System.out.println("The multiple of " + num + " is ");
        for (int i = 1 ; i <= 10 ; i++ ){
            int mul = num * i;
            System.out.println(num +" x " + i + " is " + mul);
        }
    }
}
