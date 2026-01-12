class WalletPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        if (amount > 5000) {
            throw new PaymentFailedException("Wallet limit exceeded");
        }
        System.out.println("Paid ₹" + amount + " using Wallet");
    }
}
