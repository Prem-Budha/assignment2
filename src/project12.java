import java.util.Scanner;

public class project12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Subjects: OS, DCN, CO, OE, OOP
        System.out.print("Enter marks for Operating System (OS): ");
        int os = sc.nextInt();

        System.out.print("Enter marks for Data Communication & Networking (DCN): ");
        int dcn = sc.nextInt();

        System.out.print("Enter marks for Computer Organization (CO): ");
        int co = sc.nextInt();

        System.out.print("Enter marks for Computer Ethices (CE): ");
        int ce = sc.nextInt();

        System.out.print("Enter marks for Object-Oriented Programming (OOP): ");
        int oop = sc.nextInt();


        double average = (os + dcn + co + ce + oop) / 5.0;


        String grade = (average >= 80) ? "A"
                : (average >= 70) ? "B"
                  : (average >= 60) ? "C"
                    : (average >= 50) ? "D"
                      : "F";

        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
