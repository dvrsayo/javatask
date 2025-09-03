import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();
        
        StringBuilder reversedBuilder = new StringBuilder(input);
        reversedBuilder.reverse();
        String reversed = reversedBuilder.toString();
        
        if (input.equals(reversed)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
        
        scanner.close();
    }
}