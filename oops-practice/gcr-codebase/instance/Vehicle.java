import java.util.Scanner;

class Vehicle {

    // instance variables
    String ownerName;
    String vehicleType;

    // class variable (same for all vehicles)
    static double registrationFee = 1000.0;

    // constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // instance method
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // class method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Registration Fee:");
        double fee = sc.nextDouble();
        Vehicle.updateRegistrationFee(fee);
        // consume newline
        sc.nextLine(); 

        System.out.println("Enter number of vehicles:");
        int n = sc.nextInt();
        // consume newline
        sc.nextLine(); 

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter owner name:");
            String owner = sc.nextLine();

            System.out.println("Enter vehicle type:");
            String type = sc.nextLine();

            Vehicle v = new Vehicle(owner, type);
            v.displayVehicleDetails();
        }

        
    }
}
