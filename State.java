public class State {
    // Fields
    private String name;
    private SalesTaxBehavior tax;

    // Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    // Nothing implemented here; this gets overridden by the subclasses
    public void showTax(double value) {

    }

    // Setter method; allows for dynamically setting the behavior
    public void setTaxBehavior(SalesTaxBehavior tax) {
        this.tax = tax;
    }
}