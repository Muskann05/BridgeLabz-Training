public class UpiPayment implements Payment {

    public void pay(double amount) throws PaymentFailedException {
        if (amount > 50000) {
            throw new PaymentFailedException("UPI limit exceeded");
        }
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}
