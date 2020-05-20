import java.math.BigDecimal;
import java.util.function.Function;

public class CalculateFinalPriceImpl implements CalculateFinalPrice {

    @Override
    public BigDecimal calculate(Function<BigDecimal, BigDecimal> calcDiscount, Function<BigDecimal, BigDecimal> calcTax, BigDecimal listingPrice) {
        return calcTax.compose(calcDiscount).apply(listingPrice);
    }

    @Override
    public BigDecimal apply(BigDecimal listingPrice) {
        Function<BigDecimal, BigDecimal> calculateDiscount = new CalculateDiscount();
        Function<BigDecimal, BigDecimal> calculateTax = new CalculateTax();

        return calculate(calculateDiscount, calculateTax, listingPrice);
    }
}
