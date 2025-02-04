public class HawaiiTax implements SalesTaxBehavior {

    /**
     * Computes total price when there is a 4.5% sales tax
     * @param value the price of the product without tax
     * @return the tax applied to the product
     */
    public double compute(double value) {
        return 0.045 * value;
    }
}