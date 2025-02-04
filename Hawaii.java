/**
 * Hawaii extends the State class, overriding the method showTax
 */
public class Hawaii extends State {

    /**
     * Prints the sales tax applied to a product in the state of Hawaii
     * @param value the price of the product
     */
    public void showTax(double value) {
        // Hawaii uses HawaiiTax (4.5%)
        SalesTaxBehavior hawaiiTax = new HawaiiTax();
        double salesTax = hawaiiTax.compute(value);
        System.out.printf("The sales tax on $%.2f in Hawaii is $", value);
        System.out.printf("%.2f", salesTax);
        System.out.println(".");
    }
}