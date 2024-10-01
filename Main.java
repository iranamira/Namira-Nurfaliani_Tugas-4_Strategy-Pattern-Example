// Main.java
public class Main {
    public static void main(String[] args) {
        // Buat objek PriceCalculator
        PriceCalculator calculator = new PriceCalculator();

        // Set strategi diskon untuk member
        calculator.setDiscountStrategy(new MemberDiscountStrategy());
        double memberPrice = calculator.calculatePrice(100);
        System.out.println("Harga setelah diskon untuk member: " + memberPrice);

        // Set strategi diskon untuk non-member
        calculator.setDiscountStrategy(new NonMemberDiscountStrategy());
        double nonMemberPrice = calculator.calculatePrice(100);
        System.out.println("Harga setelah diskon untuk non-member: " + nonMemberPrice);

        // Set strategi diskon musiman
        calculator.setDiscountStrategy(new SeasonalDiscountStrategy());
        double seasonalPrice = calculator.calculatePrice(100);
        System.out.println("Harga setelah diskon musiman: " + seasonalPrice);
    }
}
