package Hard2;

import java.math.BigDecimal;

public abstract class Product {
    private final String name;
    private final BigDecimal price;
    private final Condition condition;
    private final PricingStrategy pricingStrategy;

    protected Product(String name, BigDecimal price, Condition condition, PricingStrategy pricingStrategy) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty");
        }
        if (price == null) {
            throw new IllegalArgumentException("Product price cannot be null");
        }
        if (price.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Product price must be positive");
        }
        this.name = name;
        this.price = price;
        this.condition = condition;
        this.pricingStrategy = pricingStrategy;
    }

    protected Product(String name, double price, Condition condition, PricingStrategy pricingStrategy) {
        this(name, BigDecimal.valueOf(price), condition, pricingStrategy);
    }

    public abstract String getBrand();
    public abstract String getDescription();

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getFinalPrice() {
        return pricingStrategy.calculatePrice(price, condition);
    }

    public String getColor() {
        return "N/A";
    }

    public Condition getCondition() {
        return condition;
    }
}