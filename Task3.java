public class Task3 {
    
    public static void main(String[] args) {
    String a = new String("Wow");
    String b = a;
    String c = "Woww";
    String d = "Wow!";

    boolean b1 = a == b; //true (same object reference)
    boolean b2 = d.equals(b + "!"); //true since both equal "Wow!"
    boolean b3 = !c.equals(a); //true since "Woww" does not equal "Wow"

    if (b1 && b2 && b3) {
    System.out.println("Success!");
    }
}
}
