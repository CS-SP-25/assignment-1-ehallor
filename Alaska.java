public class Alaska extends State {
    // Alaska extends the State class
    public void showTax(double value) {
        // Alaska uses noTax
        SalesTaxBehavior noTax = new NoTax();
        double salesTax = noTax.compute(value);
        System.out.printf("The sales tax on $%.2f in Alaska is $", value);
        System.out.printf("%.2f", salesTax);
        System.out.println(".");
    }
}