public class Main {
    public static void main(String[] args) {

        FlightService service = new FlightService();

        // Book flights
        service.bookFlight("Rahul", "Delhi", "Mumbai");
        service.bookFlight("Anita", "Mumbai", "Bangalore");

        // Display bookings
        service.displayBookings();
    }
}
