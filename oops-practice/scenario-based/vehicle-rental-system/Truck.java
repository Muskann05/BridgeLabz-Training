public class Truck extends Vehicle implements IRentable {

    public Truck(int id, String brand, double rate) {
        super(id, brand, rate);
    }
    
    public double calculateRent(int days) {
        return ratePerDay * days + 1000; // heavy vehicle charge
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Truck");
    }
}
