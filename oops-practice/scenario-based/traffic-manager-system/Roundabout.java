import java.util.ArrayList;

public class Roundabout {
    private ArrayList<Vehicle> vehicles;

    public Roundabout() {
        vehicles = new ArrayList<>();
    }

    // Vehicle enters the roundabout
    public void enter(Vehicle v) {
        vehicles.add(v);
        System.out.println(v + " entered the roundabout.");
    }

    // Vehicle exits the roundabout
    public void exit(String vehicleNumber) {
        Vehicle toRemove = null;
        for (Vehicle v : vehicles) {
            if (v.getVehicleNumber().equals(vehicleNumber)) {
                toRemove = v;
                break;
            }
        }
        if (toRemove != null) {
            vehicles.remove(toRemove);
            System.out.println(toRemove + " exited the roundabout.");
        } else {
            System.out.println("Vehicle " + vehicleNumber + " not found in the roundabout.");
        }
    }

    // Display current vehicles in roundabout
    public void display() {
        if (vehicles.isEmpty()) {
            System.out.println("Roundabout is empty.");
        } else {
            System.out.println("Vehicles currently in roundabout:");
            for (Vehicle v : vehicles) {
                System.out.println(" - " + v);
            }
        }
    }
}
