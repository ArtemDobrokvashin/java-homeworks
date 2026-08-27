package Hard2;

public class EmailSubscriber implements Subscriber{
    @Override
    public void update(Product product) {
        System.out.println("✅ Товар ДОСТУПЕН: " + product.getName());
        System.out.println("💰 Цена: " + product.getPrice());
    }
}
