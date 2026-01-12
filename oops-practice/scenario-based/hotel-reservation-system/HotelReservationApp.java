public class HotelReservationApp {
    public static void main(String[] args) {

        Guest guest = new Guest("Rahul");
        Room room = new DeluxeRoom(101);
        PricingStrategy pricing = new SeasonalPricing();

        Reservation reservation = new Reservation(guest, room, 2);

        try {
            reservation.checkIn();
            double bill = reservation.generateBill(pricing);
            System.out.println("Total Bill: Rs." + bill);
            reservation.checkOut();
        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
