public class MemberDiscountStrategy implements DiscountStrategy {
    @Override
    public double getDiscountedPrice(double price) {
  
        return price * 0.9;
    }
}
