public class Car extends Vehicle implements IRentable {

    public Car(int id, String brand, double rate) {
        super(id, brand, rate);
    }
   
    public double calculateRent(int days) {
        return ratePerDay * days + 500; 
    }
   
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car");
    }
}
