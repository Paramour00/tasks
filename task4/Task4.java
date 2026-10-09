package task4;
import java.util.*;



public class Task4 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reversing the input string
        String reversed = new StringBuilder(input).reverse().toString();

        // Checking the input if it is a palindrome
        if (input.equals(reversed)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        scanner.close();
    }
    
}
