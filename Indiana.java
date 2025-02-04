public class Indiana extends State {
    // Indiana extends the State class
    public void showTax(double value) {
        // Indiana uses sevenPercent
        SalesTaxBehavior sevenPercent = new SevenPercent();
        double salesTax = sevenPercent.compute(value);
        System.out.printf("The sales tax on $%.2f in Indiana is $", value);
        System.out.printf("%.2f", salesTax);
        System.out.println(".");
    }
}