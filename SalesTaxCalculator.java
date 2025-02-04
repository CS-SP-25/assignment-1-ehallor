public class SalesTaxCalculator {
    public static void main(String[] args) {
        // Read in the input arguments
        String location = args[0];
        double price = Integer.parseInt(args[1]);

        // Create a variable to hold the State
        State state;

        // Determine which state we are in and use their corresponding tax policy
        if (location.equals("Alaska")) {
            state = new Alaska();
            state.setTaxBehavior(new NoTax()); // dynamically sets the behavior
            state.setName("Alaska");
            state.showTax(price);
        }
        else if (location.equals("Indiana")) {
            state = new Indiana();
            state.setTaxBehavior(new SevenPercent()); // dynamically sets the behavior
            state.setName("Indiana");
            state.showTax(price);
        }
        else if (location.equals("Hawaii")) {
            state = new Hawaii();
            state.setTaxBehavior(new HawaiiTax()); // dynamically sets the behavior
            state.setName("Hawaii");
            state.showTax(price);
        }
    }
}