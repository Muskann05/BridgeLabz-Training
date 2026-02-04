public class OnlinePayment implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processed payment of ₹" + amount);
    }
}
