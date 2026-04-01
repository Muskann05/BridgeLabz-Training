interface Discountable {
    double applyDiscount();
    void getDiscountDetails();
}

abstract class FoodItem {

    // Encapsulation
    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String name, double price, int qty) {
        this.itemName = name;
        this.price = price;
        this.quantity = qty;
    }

    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }

    // Concrete method
    public void getItemDetails() {
        System.out.println(itemName + " | Qty: " + quantity + " | Price: ₹" + price);
    }

    // Abstract method
    abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable {

    VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }

    public void getDiscountDetails() {
        System.out.println("10% discount on Veg Item");
    }
}

class NonVegItem extends FoodItem implements Discountable {

    NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50; // extra charge
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    public void getDiscountDetails() {
        System.out.println("5% discount on Non-Veg Item");
    }
}

public class OnlineFoodDelivery {

    // Polymorphic order processing
    static void processOrder(FoodItem item) {
        item.getItemDetails();
        System.out.println("Total Price: ₹" + item.calculateTotalPrice());
    }

    public static void main(String[] args) {

        FoodItem item1 = new VegItem("Paneer Pizza", 300, 2);
        FoodItem item2 = new NonVegItem("Chicken Burger", 200, 2);

        processOrder(item1);
        processOrder(item2);
    }
}
