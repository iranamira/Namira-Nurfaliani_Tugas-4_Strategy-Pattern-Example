public class PriceCalculator {
    private DiscountStrategy discountStrategy;

 
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

   
    public double calculatePrice(double price) {
        if (discountStrategy == null) {
            throw new IllegalStateException("DiscountStrategy belum diset.");
        }
        return discountStrategy.getDiscountedPrice(price);
    }
}
