import java.util.ArrayList;

public class Fridge {
    private ArrayList<Product> products;
    private final double constVolume = 100;

    public Fridge() {
        products = new ArrayList<>();
    }

    public void putOnFridge(Product product) {
        double volumeAllProducts = 0;
        for (Product p : products) {
            volumeAllProducts = volumeAllProducts + p.getVolume();
        }
        double totalVolume = volumeAllProducts + product.getVolume();
        if (totalVolume <= constVolume) {
            products.add(product);
            System.out.println("Положили в холодильник продукт:" + product.getName() + ". Остаток свободного объема в холодильнике равен = " + (constVolume - totalVolume));
        } else {
            System.out.println("Добавить " + product.getName() +" не получится. Объем продукта " + product.getVolume() + " превышает свободный объем холодильника");
        }
    }

    public boolean isFull() {
        double volumeAllProducts = 0;
        for (Product p : products) {
            volumeAllProducts += p.getVolume();
        }
        return volumeAllProducts >= constVolume;
    }

    public void printContents() {
        System.out.println("\nСодержимое холодильника:");
        for (Product p : products) {
            System.out.println("- " + p.getName() + " (" + p.getVolume() + ")");
        }
    }
}
