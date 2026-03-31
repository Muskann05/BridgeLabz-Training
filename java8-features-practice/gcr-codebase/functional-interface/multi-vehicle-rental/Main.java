public class Main {
    public static void main(String[] args) {
        Rental car = new Car();
        Rental bike = new Bike();
        Rental bus = new Bus();
        car.rent();
        bike.rent();
        bus.rent();
        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
