public class NoTax implements SalesTaxBehavior {

    /**
     * Computes total price when there is no sales tax.
     * @param value the price of the product without tax
     * @return the total price with tax
     */
    public double compute(double value) {
        return 0; // No sales tax
    }
}