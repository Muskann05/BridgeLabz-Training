public class ECommerceApp {
    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop", 45000);
        Customer c1 = new Customer("Muskan" , 1);

        c1.displayCustomer();
        p1.displayProduct();

        Order order = new Order(5001, p1);

        // Polymorphism
        Payment payment = new UpiPayment(); 
        order.placeOrder(payment);

        order.trackOrder();
        order.cancelOrder();
        order.trackOrder();
    }
}
