public class SeasonalPricing implements PricingStrategy {
    public double calculatePrice(double basePrice) {
        return basePrice + (basePrice * 0.20);
    }
}
