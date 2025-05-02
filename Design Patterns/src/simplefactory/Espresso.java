/**
 * Represents an Espresso coffee.(Concrete Product)
 */
public class Espresso implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing a strong Espresso.");
    }
}
