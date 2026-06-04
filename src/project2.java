//2) AI Age Predictor
//Ask the user for their current age.
    //    Display:
  //      ● Their age after 10 years
//● Their age after 25 years
//● Their age after 50 years
//Bonus: Predict the year they will turn 100.

import java.util.Scanner;
import java.time.Year;

public class project2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your current age : ");
        int age =  input.nextInt();

        int a = age + 10;
        int b = age + 25;
        int c = age + 50;

        System.out.println("Your age after 10 years is " + a);
        System.out.println("Your age after 25 years is " + b);
        System.out.println("Your age after 50 years is " + c);

        int year = Year.now().getValue();

        int d = year - age;
        System.out.println("Your Birth date is: " + d);

        int e = d + 100;
        System.out.println("In " + e + "AD your age will be 100 years.");
    }
}
