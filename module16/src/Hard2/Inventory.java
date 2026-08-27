package Hard2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Inventory {
    private Map<String, Set<Subscriber>> subscribers;
    private Map<String, Product> products;
    private Map<String, Boolean> availability;

    public Inventory() {
        this.subscribers = new HashMap<>();
        this.products = new HashMap<>();
        this.availability = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (this.products.containsKey(product.getName())) {
            this.products.put(product.getName(), product);
        } else {
            this.products.put(product.getName(), product);
        }
        availability.put(product.getName(), false);
    }

    public void subscribe(Subscriber subscriber, String productName) { // ← Добавьте "r" в subscriber
        addSubscriber(subscriber, productName);
    }

    private void addSubscriber(Subscriber subscriber, String productName) {
        Set<Subscriber> subscriberSet = this.subscribers.get(productName);
        if (subscriberSet == null) {
            subscriberSet = new HashSet<>();
            this.subscribers.put(productName, subscriberSet);
        }
        subscriberSet.add(subscriber);
    }

    public void setProductAvailable(String productName, boolean available) {
        Set<Subscriber> subscriberSet = this.subscribers.get(productName);
        if (!products.containsKey(productName)) {
            throw new IllegalArgumentException("Продукта " + productName + " нет");
        }
        boolean oldAvailable = this.availability.get(productName);
        availability.put(productName, available);
        if (available && !oldAvailable) {
            Product product = products.get(productName);

            if (subscriberSet != null) {
                for (Subscriber subscriber : subscriberSet) {
                    subscriber.update(product);
                }
            }
        }
    }
}

