/* Fitness Challenge Tracker
The user enters the number of steps walked each day for 7 days.
Calculate:
● Total steps
● Average steps
● Highest number of steps */

import java.util.Scanner;

public class project3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalstep=0;
        int higheststep =0;

        for(int i=1; i <= 7;i++) {

            System.out.print("Enter your step in Day" + i +" :");
            int currentstep = input.nextInt();

            totalstep+=currentstep;

            if(currentstep>higheststep) {

            higheststep=currentstep;

            }
        }
        int averagestep = totalstep/7;

        System.out.println("Total step you traveled: "+ totalstep);
        System.out.println("The average of your age is "+averagestep);
        System.out.println("The highest step you traveled: "+ higheststep);
    }
}
