import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();
        
        //For case-insensitive comparison
        String normalized = input.toLowerCase();
        
        // Reverse the string
        String reversed = new StringBuilder(normalized).reverse().toString();
        
        // Check if original and reversed strings are equal
        boolean isPalindrome = normalized.equals(reversed);
        
        // result
        if (isPalindrome) {
            System.out.println("is a palindrome!");
        } else {
            System.out.println("is not a palindrome.");
        }
        
        scanner.close();
    }
}