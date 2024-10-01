public class SeasonalDiscountStrategy implements DiscountStrategy {
    @Override
    public double getDiscountedPrice(double price) {
        // Diskon 20% untuk diskon musiman
        return price * 0.8;
    }
}
