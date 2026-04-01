import java.util.*;

public class FlightService {

    // Array to store available flights
    Flight[] flights = {
        new Flight(101, "Indigo", "Delhi", "Mumbai"),
        new Flight(102, "Air India", "Delhi", "Chennai"),
        new Flight(103, "Vistara", "Mumbai", "Bangalore")
    };

    // List to store bookings
    List<Booking> bookings = new ArrayList<>();

    // SEARCH (case-insensitive)
    public Flight searchFlight(String source, String destination) {
        for (Flight f : flights) {
            if (f.source.equalsIgnoreCase(source)
                    && f.destination.equalsIgnoreCase(destination)) {
                return f;
            }
        }
        return null;
    }

    // CREATE (Book flight)
    public void bookFlight(String customerName, String source, String destination) {
        Flight f = searchFlight(source, destination);
        if (f != null) {
            bookings.add(new Booking(customerName, f));
            System.out.println("Flight booked successfully!");
        } else {
            System.out.println("Flight not found!");
        }
    }

    // READ (Display bookings)
    public void displayBookings() {
        System.out.println("\nBooking Details:");
        for (Booking b : bookings) {
            b.displayBooking();
        }
    }
}
