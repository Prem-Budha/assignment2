/* Right-Angled Triangle Pattern
Write a Java program to print a right-angled triangle of * with a given number of rows.
Example (rows = 5):
*
**
***
****
*****

 */


public class project8 {
    public static void main(String[] args){
        int num = 5;
        for (int i = 1 ; i <= 5; i++ ){
            for (int j = 1 ; j <= i; j++ ){
                System.out.print("* ");
                System.out.print("  ");

            }
            System.out.println(" ");
        }
    }
}
