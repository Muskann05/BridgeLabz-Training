public class StandardRoom extends Room {

    public StandardRoom(int roomNumber) {
        super(roomNumber, 2000);
    }
    public double calculatePrice(PricingStrategy strategy) {
        return strategy.calculatePrice(basePrice);
    }
}
