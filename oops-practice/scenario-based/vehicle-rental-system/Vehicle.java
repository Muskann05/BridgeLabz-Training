public class Vehicle {
    protected int vehicleId;
    protected String brand;
    protected double ratePerDay;

    public Vehicle(int vehicleId, String brand, double ratePerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.ratePerDay = ratePerDay;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void displayInfo() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
    }
}
