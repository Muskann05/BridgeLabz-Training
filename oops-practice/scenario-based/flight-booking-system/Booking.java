public class Booking {
    String customerName;
    Flight flight;

    public Booking(String customerName, Flight flight) {
        this.customerName = customerName;
        this.flight = flight;
    }

    public void displayBooking() {
        System.out.println("Customer Name: " + customerName);
        flight.displayFlight();
    }
}
