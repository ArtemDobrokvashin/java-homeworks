public class Product {
    private String name;
    private double volume;

    public Product(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

}
