public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer(1, "Amit");

        Vehicle b1 = new Bike(101, "Honda", 300);
        Vehicle c2 = new Car(102, "Hyundai", 1200);
        Vehicle t1 = new Truck(103, "Tata", 2500);

        RentalService rs = new RentalService();

        rs.addVehicle(b1);
        rs.addVehicle(c2);
        rs.addVehicle(t1);

        System.out.println("Available Vehicles:");
        rs.displayVehicles();

        System.out.println("Rent for 3 days:");
        System.out.println("Bike Rent: " + ((IRentable) b1).calculateRent(3));
        System.out.println("Car Rent: " + ((IRentable) c2).calculateRent(3));
        System.out.println("Truck Rent: " + ((IRentable) t1).calculateRent(3));

        rs.removeVehicle(102);

        System.out.println("After Removing Car:");
        rs.displayVehicles();
    }
}
