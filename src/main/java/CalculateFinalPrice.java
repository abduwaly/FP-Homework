import java.math.BigDecimal;
import java.util.function.Function;

interface CalculateFinalPrice extends Function<BigDecimal, BigDecimal> {
    BigDecimal calculate(
            Function<BigDecimal, BigDecimal> calcDiscount,
            Function<BigDecimal, BigDecimal> calcTax,
            BigDecimal listingPrice
    );
}
