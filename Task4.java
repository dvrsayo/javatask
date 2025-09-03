import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();
        
        // Use StringBuilder to reverse the input string
        StringBuilder reversedBuilder = new StringBuilder(input);
        reversedBuilder.reverse();
        String reversed = reversedBuilder.toString();
        
        // Check if the original and reversed strings are the same
        if (input.equals(reversed)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
        
        scanner.close();
    }




}