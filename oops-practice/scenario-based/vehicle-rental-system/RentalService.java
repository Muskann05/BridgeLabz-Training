import java.util.*;

public class RentalService {
    private List<Vehicle> vehicles = new ArrayList<>();

    // CREATE
    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }
    // READ
    public void displayVehicles() {
        for (Vehicle v : vehicles) {
            v.displayInfo();
            
        }
    }
    // DELETE
    public void removeVehicle(int id) {
        vehicles.removeIf(v -> v.getVehicleId() == id);
    }
}
