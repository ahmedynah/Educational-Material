/**
 * Represents a Cappuccino coffee.(Concrete Product)
 */
public class Cappuccino implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing a creamy Cappuccino.");
    }
}
