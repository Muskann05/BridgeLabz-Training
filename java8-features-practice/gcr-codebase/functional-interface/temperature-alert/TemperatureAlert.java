import java.util.function.Predicate;
public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> alert = temp -> temp > 37.5;
        double currentTemp = 39.0;
        if (alert.test(currentTemp)) {
            System.out.println("Alert! High Temperature");
        } else {
            System.out.println("Temperature is normal");
        }
    }
}
