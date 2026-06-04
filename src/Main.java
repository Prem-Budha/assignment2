//
//Smart Attendance Checker

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter percentage of your Attendance: ");
        int n = input.nextInt();
        if (n >= 75){
            System.out.println("Eligible for Exam");
        }
        else {
            System.out.println("Not Eligible for Exam");
        }
    }
}