class Order {
    private int orderId;
    private Product product;
    private boolean isCancelled;

    public Order(int orderId, Product product) {
        this.orderId = orderId;
        this.product = product;
        this.isCancelled = false;
    }

    public void placeOrder(Payment payment) {
        try {
            payment.pay(product.getPrice());
            System.out.println("Order placed successfully");
        } catch (PaymentFailedException e) {
            System.out.println("Payment failed: " + e.getMessage());
        }
    }

    public void cancelOrder() {
        isCancelled = true;
        System.out.println("Order cancelled");
    }

    public void trackOrder() {
        if (isCancelled)
            System.out.println("Order Status: Cancelled");
        else
            System.out.println("Order Status: Out for delivery");
    }
}
