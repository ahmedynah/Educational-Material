/**
 * Factory class responsible for creating Coffee objects.
 */
public class CoffeeFactory {
    /**
     * Static factory method to create Coffee based on type.
     *
     * @param type The type of coffee requested.
     * @return Coffee object or null if type is unknown.
     */
    public static Coffee getCoffee(String type) {
        if (type == null) {
            return null;
        }

        switch (type.toLowerCase()) {
            case "espresso":
                return new Espresso();
            case "cappuccino":
                return new Cappuccino();
            default:
                return null;
        }
    }
}
