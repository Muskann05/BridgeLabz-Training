public abstract class Room {
    protected int roomNumber;
    protected boolean isAvailable = true;
    protected double basePrice;

    public Room(int roomNumber, double basePrice) {
        this.roomNumber = roomNumber;
        this.basePrice = basePrice;
    }

    public abstract double calculatePrice(PricingStrategy strategy);

    public void bookRoom() throws RoomNotAvailableException {
        if (!isAvailable) {
            throw new RoomNotAvailableException("Room not available!");
        }
        isAvailable = false;
    }

    public void checkout() {
        isAvailable = true;
    }
}
