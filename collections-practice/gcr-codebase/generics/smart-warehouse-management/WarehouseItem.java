public abstract class WarehouseItem {
    private String name;
    private double price;
    // Constructor
    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // Method to get name
    public String getName() {
        return name;
    }
    // method to get price
    public double getPrice() {
        return price;
    } 
    public abstract String getCategory();
}
