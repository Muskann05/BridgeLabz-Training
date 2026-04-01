class Product {

    // Static
    // discount percentage shared by all products
    static double discount = 10.0; 

    // Instance variables
    String productName;
    double price;
    int quantity;

    // Final 
    final String productID;

    // Constructor 
    Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static Method 
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Calculate price after discount 
    double priceAfterDiscount() {
        return price - (price * discount / 100);
    }

    // Display
    void displayProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Price after Discount: $" + priceAfterDiscount());
    }
}

// Main Class
public class ShoppingCartSystem {
    public static void main(String[] args) {

        // Update discount for all products
        Product.updateDiscount(10.0);
        Product p1 = new Product(
                "P001",
                "Laptop",
                1200.0,
                5
        );
        Product p2 = new Product(
                "P002",
                "Smartphone",
                800.0,
                10
        );
        //  instanceof 
        if (p1 instanceof Product) {
            p1.displayProductDetails();
        }
        if (p2 instanceof Product) {
            p2.displayProductDetails();
        }
    }
}
