/* Palindrome Number
Given an integer x, write a Java method that returns true if x is a palindrome,
otherwise return false.

 */
import java.util.Scanner;

public class project10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word : ");
        String word = input.nextLine();

        String reverse = new StringBuffer(word).reverse().toString();
        word = word.toLowerCase();
        reverse = reverse.toLowerCase();

        if (word.equals(reverse)){
            System.out.println("The word is palindrome.");
        }
        else{
            System.out.println("The word is not palindrome.");
        }
    }
}
