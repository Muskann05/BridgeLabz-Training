public class Main {
    public static void main(String[] args) {
        PaymentProcessor payment = new OnlinePayment();
        payment.processPayment(1000);
        payment.refund(300);
    }
}
