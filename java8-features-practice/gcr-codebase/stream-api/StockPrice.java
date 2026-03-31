import java.util.*;
public class StockPrice{
    public static void main(String[] args) {
        List<Double> stockPrices = Arrays.asList(120.5, 121.3, 119.8, 122.0);
        stockPrices.forEach(price ->
            System.out.println("Stock Price: " + price)
        );
    }
}
