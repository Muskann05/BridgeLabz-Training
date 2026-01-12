// product class
public class Product {
    private int productId;
    private String name;
    private double price;
    
    // constructor
    public Product(int productId, String name,double price ){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // method to get price
    public  double getPrice(){
        return price;
    }

    // method to display info
    public void displayProduct(){
        System.out.println(productId + " - " + name + " : Rs." + price);
    }

    
}
