public class Main {
    public static void main(String[] args) {

        PriceCalculator calculator = new PriceCalculator();

        calculator.setDiscountStrategy(new MemberDiscountStrategy());
        double memberPrice = calculator.calculatePrice(100);
        System.out.println("Harga setelah diskon untuk member: " + memberPrice);

        calculator.setDiscountStrategy(new NonMemberDiscountStrategy());
        double nonMemberPrice = calculator.calculatePrice(100);
        System.out.println("Harga setelah diskon untuk non-member: " + nonMemberPrice);

        calculator.setDiscountStrategy(new SeasonalDiscountStrategy());
        double seasonalPrice = calculator.calculatePrice(100);
        System.out.println("Harga setelah diskon musiman: " + seasonalPrice);
    }
}
