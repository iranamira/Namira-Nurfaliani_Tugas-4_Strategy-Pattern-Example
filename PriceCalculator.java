// PriceCalculator.java
public class PriceCalculator {
    private DiscountStrategy discountStrategy;

    // Setter untuk mengganti strategi diskon
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    // Metode untuk menghitung harga diskon
    public double calculatePrice(double price) {
        if (discountStrategy == null) {
            throw new IllegalStateException("DiscountStrategy belum diset.");
        }
        return discountStrategy.getDiscountedPrice(price);
    }
}
