import java.util.*;

class RideService {
    List<Ride> rides = new ArrayList<>();
    int rideCounter = 1;

    // CREATE
    public void bookRide(User user, List<Driver> drivers, double distance, FareCalculator calculator)
            throws NoDriverAvailableException {

        Driver assignedDriver = null;
        for (Driver d : drivers) {
            if (d.isAvailable()) {
                assignedDriver = d;
                d.setAvailable(false);
                break;
            }
        }

        if (assignedDriver == null) {
            throw new NoDriverAvailableException("No drivers available right now!");
        }

        double fare = calculator.calculateFare(distance);
        Ride ride = new Ride(rideCounter++, user, assignedDriver, distance, fare);
        rides.add(ride);

        System.out.println("Ride booked successfully: " + ride);
    }

    // READ
    public void showRideHistory() {
        System.out.println("\nRide History:");
        for (Ride r : rides) {
            System.out.println(r);
        }
    }

    // UPDATE
    public void updateRideFare(int rideId, FareCalculator calculator) {
        for (Ride r : rides) {
            if (r.rideId == rideId) {
                r.fare = calculator.calculateFare(r.distance);
                System.out.println("Ride fare updated: " + r);
            }
        }
    }

    // DELETE
    public void cancelRide(int rideId) {
        rides.removeIf(r -> r.rideId == rideId);
        System.out.println("Ride " + rideId + " cancelled");
    }
}
