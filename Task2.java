public class Task2{

        //Create all primitives (except long and short)
        //with different values. Concatanate them into a string and print it
        //into a string and print it to the screen 
        //so it will print: H3110 w0rld 2.0 true

    public static void main(String[] args) {

        byte zero = 0;
        int one = 1;
        int three = 3;
        char capitalH = 'H';
        char w = 119;   // ASCII value for 'w'
        char o = 79;    // ASCII value for 'O'
        char r = 114;   // ASCII value for 'r'
        char l = 108;   // ASCII value for 'l'
        char d = 100;   // ASCII value for 'd'
        float twoPointZero = 2.0f;
        boolean isTrue = true;

        String output = " " + capitalH + three + one + one + zero + " " + w + o + r + l + d + " " + twoPointZero + " " + isTrue;
        System.out.println(output);


    }
    
}
