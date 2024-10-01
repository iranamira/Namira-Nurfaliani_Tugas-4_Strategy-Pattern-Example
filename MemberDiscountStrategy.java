// MemberDiscountStrategy.java
public class MemberDiscountStrategy implements DiscountStrategy {
    @Override
    public double getDiscountedPrice(double price) {
        // Diskon 10% untuk member
        return price * 0.9;
    }
}