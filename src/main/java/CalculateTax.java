import java.math.BigDecimal;
import java.util.function.Function;

public class CalculateTax implements Function<BigDecimal, BigDecimal> {
    public BigDecimal apply(BigDecimal price) {

        return price.multiply(new BigDecimal("1.1"));
    }
}
