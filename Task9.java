import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static float divide(int a, int b) {
        return (float) a / b;
    }

    public static void main(String[] args) {
        int firstNum = 15;
        int secondNum = 2;
        
        System.out.println("Math Operations Results:");
        System.out.println("Numbers: " + firstNum + " and " + secondNum);
        System.out.println("Addition: " + add(firstNum, secondNum));
        System.out.println("Subtraction: " + subtract(firstNum, secondNum));
        System.out.println("Multiplication: " + multiply(firstNum, secondNum));
        System.out.println("Division: " + divide(firstNum, secondNum));
    }
}