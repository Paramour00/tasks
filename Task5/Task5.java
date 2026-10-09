package Task5;
import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter 3 numbers: "); 
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int c = sc.nextInt();

        // Check if all numbers are equal
        if (a == b && b == c) System.out.println("All numbers are equal.");
        
        else System.out.println("Largest: " + Math.max(a, Math.max(b, c))); 

        sc.close();
    }
}
