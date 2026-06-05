/*Pyramid Pattern
Write a Java program to print a pyramid of * with a given number of rows.
Example (rows = 5):
     *
    ***
   *****
  *******
 *********

 */


public class project9 {
    public static void main(String[] args) {
        int a = 5;

        for (int i = 1 ; i <= a ; i++ ){

            for (int j = 1 ; j <= a - i ; j++ ){
                System.out.print(" ");
            }

            for (int j = 1 ; j <= ( 2 * i -1) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
