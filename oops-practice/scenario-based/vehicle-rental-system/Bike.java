public class Bike extends Vehicle implements IRentable {
    
    public Bike(int id, String brand, double rate) {
        super(id, brand, rate);
    }
    
    public double calculateRent(int days) {
        return ratePerDay * days;
    }
   
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Bike");
    }
}
