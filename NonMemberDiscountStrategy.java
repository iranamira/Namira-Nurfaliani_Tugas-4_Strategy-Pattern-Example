public class NonMemberDiscountStrategy implements DiscountStrategy {
    @Override
    public double getDiscountedPrice(double price) {
        // Diskon 5% untuk non-member
        return price * 0.95;
    }
}