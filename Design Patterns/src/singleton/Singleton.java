package singleton;

public class Singleton {

    // Step 1: Static variable to hold the single instance
    private static Singleton instance;

    // Step 2: Private constructor to prevent instantiation
    private Singleton() {}

    // Step 3: Public static method to return the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Lazy initialization
        }
        return instance;
    }

    public void printMessage() {
        System.out.println("Hello from Singleton.Singleton!");
    }
}
