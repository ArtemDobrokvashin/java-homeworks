package Hard2;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class NotificationService {
    private static final NotificationService INSTANCE = new NotificationService();
    private static final int MAX_LIMIT = 100;
    private final Queue<Long> timestamps = new ConcurrentLinkedQueue<>();

    private NotificationService() { }

    public static NotificationService getInstance() {
        return INSTANCE;
    }

    public void sendNotification(String email, Product product) {
        long now = System.currentTimeMillis();

        while (!timestamps.isEmpty() && now - timestamps.peek() > 1000) {
            timestamps.poll();
        }

        if (timestamps.size() >= MAX_LIMIT) {
            throw new RuntimeException("Too many notifications");
        }

        timestamps.add(now);

        System.out.println("Sending notification..." + email + " " + product.getName());
    }
}