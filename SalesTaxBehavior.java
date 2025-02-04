public interface SalesTaxBehavior {
    // This interface specifies a method that must be overridden by NoTax and SevenPercent
    double compute(double value);
}