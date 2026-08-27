package Hard2;

import java.math.BigDecimal;

public class iPhone extends Product {
    private final String brand;
    private final String os;
    private final int memory;
    private final String color;
    private final String description;

    public iPhone(
            String name,
            BigDecimal price,
            PricingStrategy pricingStrategy,
            String brand,
            String os,
            int memory,
            String color,
            String description,
            Condition condition
    ) {
        super(name, price, condition, pricingStrategy);
        this.brand = brand;
        this.os = os;
        this.memory = memory;
        this.color = color;
        this.description = description;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getColor() {
        return color;
    }

    public static class Builder {
        private String name;
        private BigDecimal price;
        private String brand;
        private String os;
        private int memory;
        private String color;
        private String description;
        private Condition condition = Condition.NEW;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder os(String os) {
            this.os = os;
            return this;
        }

        public Builder memory(int memory) {
            this.memory = memory;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder condition(Condition condition) {
            this.condition = condition;
            return this;
        }

        public iPhone build() {
            if (name == null) throw new IllegalArgumentException("Name is required");
            if (price == null) throw new IllegalArgumentException("Price is required");

            PricingStrategy strategy;
            switch (condition) {
                case NEW:
                    strategy = new StandardPricing();
                    break;
                case USED:
                    strategy = new UsedPricing();
                    break;
                case CLEARANCE:
                    strategy = new ClearancePricing();
                    break;
                default:
                    strategy = new StandardPricing();
            }

            String finalBrand = (brand != null) ? brand : "Apple";
            String finalOs = (os != null) ? os : "iOS";

            return new iPhone(
                    name,
                    price,
                    strategy,
                    finalBrand,
                    finalOs,
                    memory,
                    color,
                    description,
                    condition
            );
        }
    }
}