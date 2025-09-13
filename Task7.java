import java.util.Scanner;

public class Task7{

    public static int add(int a, int b){
        return a + b;
    }
    
    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        return a / b;
    }

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int plus = add(num1, num2);
        int minus = subtract(num1, num2);
        int product = multiply(num1, num2);
        int quotient = divide(num1, num2);
        

        System.out.println("\nResults:");
        System.out.println(num1 + " + " + num2 + " = " + plus);
        System.out.println(num1 + " - " + num2 + " = " + minus);
        System.out.println(num1 + " * " + num2 + " = " + product);
        
        if (num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + quotient);
        }
        
        scanner.close();
    }
}