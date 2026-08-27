package Hard2;

import java.math.BigDecimal;

public class ClearancePricing implements PricingStrategy {
    @Override
    public BigDecimal calculatePrice(BigDecimal basePrice, Condition condition) {
        return basePrice.multiply(new BigDecimal("0.8"));
    }
}
