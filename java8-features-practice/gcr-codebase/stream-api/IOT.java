import java.util.*;
public class IOT {
    public static void main(String[] args) {
        List<Double> readings = Arrays.asList(45.2, 60.5, 30.1, 75.0, 52.3);
        double threshold = 50;
        readings.stream()
            .filter(r -> r > threshold)
            .forEach(r ->
                System.out.println("High Reading: " + r)
            );
    }
}
