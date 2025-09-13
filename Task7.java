import java.util.Scanner;

public class Task7{

    public static float add(float a, float b) {
        return a + b;
    }
    
    public static float subtract(float a, float b) {
        return a - b;
    }
    
    public static float multiply(float a, float b) {
        return a * b;
    }
    
    public static float divide(float a, float b) {
        return a / b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        float num1 = scanner.nextFloat();
        
        System.out.print("Enter second number: ");
        float num2 = scanner.nextFloat();
        
        float plus = add(num1, num2);
        float minus = subtract(num1, num2);
        float product = multiply(num1, num2);
        float quotient = divide(num1, num2);
        
        System.out.println("\nResults:");
        System.out.println(num1 + " + " + num2 + " = " + plus);
        System.out.println(num1 + " - " + num2 + " = " + minus);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
        scanner.close();
    }
}