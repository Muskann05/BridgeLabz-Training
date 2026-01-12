class CardPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        if (amount <= 0) {
            throw new PaymentFailedException("Invalid amount for Card Payment");
        }
        System.out.println("Paid Rs." + amount + " using Card");
    }
}
