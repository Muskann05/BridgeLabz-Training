public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product p1 = new Product(1, "Laptop");
        Product p2 = (Product) p1.clone();
        System.out.println("Original: " + p1.name);
        System.out.println("Clone: " + p2.name);
    }
}