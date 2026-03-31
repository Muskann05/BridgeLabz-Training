import java.util.*;
import java.util.stream.*;
class Claim {
    String type;
    double amount;
    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}
public class Insurance {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 2000),
            new Claim("Auto", 5000),
            new Claim("Health", 3000),
            new Claim("Home", 8000),
            new Claim("Auto", 7000)
        );
        Map<String, Double> averageClaims = claims.stream()
            .collect(Collectors.groupingBy(
                c -> c.type,
                Collectors.averagingDouble(c -> c.amount)
            ));
        averageClaims.forEach((type, avg) ->
            System.out.println(type + " Average Claim: " + avg)
        );
    }
}
