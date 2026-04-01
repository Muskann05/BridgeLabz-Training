public class Main {
    public static void main(String[] args) {
        Vehicle normalCar = new Car();
        Vehicle electricCar = new ElectricCar();
        normalCar.displaySpeed();
        normalCar.displayBattery();
        electricCar.displaySpeed();
        electricCar.displayBattery();
    }
}