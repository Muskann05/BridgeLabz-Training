import java.util.*;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "Muskan");

        List<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver(101, "Amit", true));
        drivers.add(new Driver(102, "Rahul", false));

        FareCalculator normalFare = new NormalFare();
        FareCalculator peakFare = new PeakFare();

        RideService service = new RideService();

        try {
            service.bookRide(user1, drivers, 12, normalFare);
            service.bookRide(user1, drivers, 8, peakFare);
        } catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }

        service.showRideHistory();

        service.updateRideFare(1, peakFare);

        service.cancelRide(1);

        service.showRideHistory();
    }
}
