public class Task8 {
     public static void main(String[] args) {
        // Test the method with different parameters
        PrintSums(4, 5, 10);
        System.out.println();
        PrintSums(1, 2, 3);
        System.out.println();
        PrintSums(7);
    }
    
    public static void PrintSums(int... numbers) {
        System.out.println("Input parameters: " + java.util.Arrays.toString(numbers));
        
        int totalSum = 0;
        
        System.out.println("Calculating cumulative sums:");
        for (int i = 0; i < numbers.length; i++) {
            int cumulativeSum = numbers[i] * (numbers[i] + 1) / 2;
            totalSum += cumulativeSum;
            
            System.out.println("Parameter " + (i + 1) + ": " + numbers[i] + 
                             " → Cumulative sum: " + cumulativeSum);
        }
        
        System.out.println("Total sum of all cumulative sums: " + totalSum);
    }
}
