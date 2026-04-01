public class TrafficManager {
    public static void main(String[] args) {

        Roundabout roundabout = new Roundabout();

        // Vehicles
        Vehicle v1 = new Vehicle("MH12AB1234", "Car");
        Vehicle v2 = new Vehicle("MH12XY5678", "Bike");
        Vehicle v3 = new Vehicle("MH12CD9012", "Truck");
        Vehicle v4 = new Vehicle("MH12EF3456", "Car");

        // Vehicles enter the roundabout
        roundabout.enter(v1);
        roundabout.enter(v2);
        roundabout.enter(v3);

        roundabout.display();

        // Vehicle exits
        roundabout.exit("MH12AB1234");
        roundabout.display();

        // Another vehicle enters
        roundabout.enter(v4);
        roundabout.display();
    }
}
