public class Task16 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        
        System.out.println("Feeding gorilla: " + gorilla.feed(true));
        gorilla.groom();
        gorilla.pet();
        
        System.out.println("Gorilla class implemented successfully!");
    }
}

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {
    
    @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        return timeToEat;
    }
    
    @Override
    public void groom() {
        // lather, rinse, repeat
    }
    
    @Override
    public void pet() {
        // pet at your own risk
    }
}