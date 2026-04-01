import java.util.Scanner;

class Product {

    // instance variables
    String productName;
    double price;

    // class variable (shared)
    static int totalProducts = 0;

    // constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        // increase count whenever object is created
        totalProducts++;   
    }

    // instance method
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
        
    }

    // class method
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of products:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter product " + i + " name:");
            String name = sc.nextLine();

            System.out.println("Enter product " + i + " price:");
            double price = sc.nextDouble();
            sc.nextLine(); // consume newline

            Product p = new Product(name, price);
            p.displayProductDetails();
        }

        // display total products
        Product.displayTotalProducts();

        
    }
}
