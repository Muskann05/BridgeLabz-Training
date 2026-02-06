import java.util.*;
import java.util.stream.Collectors;
class Order {
    String customerName;
    double amount;

    Order(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }
}

public class OrderRevenue {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Muskan", 2500.50),
                new Order("Mskn", 1800.00),
                new Order("Muskann", 1200.75),
                new Order("Muskaan", 3000.00),
                new Order("Musskan", 700.25)
        );

        Map<String, Double> totalRevenuePerCustomer = orders.stream()
                .collect(Collectors.groupingBy(
                        order -> order.customerName,
                        Collectors.summingDouble(order -> order.amount)
                ));

        System.out.println("Total revenue per customer:");
        totalRevenuePerCustomer.forEach((customer, total) ->
                System.out.println(customer + " -> ₹" + total));
    }
}