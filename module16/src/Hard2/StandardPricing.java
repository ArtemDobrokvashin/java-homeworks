package Hard2;

import java.math.BigDecimal;

public class StandardPricing implements PricingStrategy {
    @Override
    public BigDecimal calculatePrice(BigDecimal basePrice, Condition condition) {
        return basePrice;
    }
}
