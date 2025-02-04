public class SevenPercent implements SalesTaxBehavior {

    /**
     * Computes total price when there is a 7% sales tax.
     * @param value the price of the product without tax
     * @return the total price with tax
     */
    public double compute(double value) {
        return 0.07 * value; // 7% sales tax
    }
}