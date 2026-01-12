public class Reservation {
    private Guest guest;
    private Room room;
    private int nights;

    public Reservation(Guest guest, Room room, int nights) {
        this.guest = guest;
        this.room = room;
        this.nights = nights;
    }

    public double generateBill(PricingStrategy strategy) {
        return room.calculatePrice(strategy) * nights;
    }

    public void checkIn() throws RoomNotAvailableException {
        room.bookRoom();
        System.out.println("Check-in successful for " + guest.getName());
    }

    public void checkOut() {
        room.checkout();
        System.out.println("Checked out successfully.");
    }
}
