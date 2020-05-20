import java.math.BigDecimal;
import java.util.function.Function;

public class CalculateDiscount implements Function<BigDecimal, BigDecimal> {
    public BigDecimal apply(BigDecimal price) {
        if(price.compareTo(BigDecimal.valueOf(100)) < 0) return price;

        return price.multiply(new BigDecimal("0.8"));
    }
}
