import java.util.*;
public class ShoppingCart {
    private HashMap<String, Double> priceMap = new HashMap<>();
    private LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();
    // Add product with price
    public void addProduct(String product, double price) {
        priceMap.put(product, price);
    }
    // Add item to cart
    public void addToCart(String product, int quantity) {
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
    }
    // Display cart in insertion order
    public void displayCart() {
        System.out.println("Shopping Cart (Insertion Order):");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " x " + entry.getValue() +
                    " = " + (priceMap.get(entry.getKey()) * entry.getValue()));
        }
    }
    // Display items sorted by price
    public void displaySortedByPrice() {
        TreeMap<Double, String> sortedMap = new TreeMap<>();
        for (String product : cart.keySet()) {
            sortedMap.put(priceMap.get(product), product);
        }
        System.out.println("\nCart Sorted by Price:");
        for (Map.Entry<Double, String> entry : sortedMap.entrySet()) {
            String product = entry.getValue();
            int qty = cart.get(product);
            double price = priceMap.get(product);
            System.out.println(product + " x " + qty + " = " + (price * qty));
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Apple", 50);
        cart.addProduct("Banana", 20);
        cart.addProduct("Orange", 30);

        cart.addToCart("Apple", 2);
        cart.addToCart("Banana", 5);
        cart.addToCart("Orange", 3);

        cart.displayCart();
        cart.displaySortedByPrice();
    }
}
