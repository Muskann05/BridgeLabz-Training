class Vehicle {
    // Static
    static double registrationFee = 150.0;
    // Instance variables 
    String ownerName;
    String vehicleType;
    // Final 
    final String registrationNumber;
    // Constructor 
    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    //  Static Method 
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    //  Display 
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: $" + registrationFee);
    }
}

//  Main Class 
public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(
                "ABC123",
                "Honest raj",
                "Sedan"
        );
        Vehicle v2 = new Vehicle(
                "XYZ789",
                "Price danish",
                "SUV"
        );
        //instanceof 
        if (v1 instanceof Vehicle) {
            v1.displayVehicleDetails();
        }
        if (v2 instanceof Vehicle) {
            v2.displayVehicleDetails();
        }
    }
}
