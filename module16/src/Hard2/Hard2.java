package Hard2;

import java.math.BigDecimal;

public class Hard2 {
    public static void main(String[] args) throws InterruptedException {
        Inventory inventory = new Inventory();

        Product newIphone = iPhone.builder()
                .name("iPhone 15")
                .price(new BigDecimal("999.99"))
                .build();
        System.out.println("New: " + newIphone.getFinalPrice());

        NotificationService service = NotificationService.getInstance();

        for (int i = 0; i < 100; i++) {
            service.sendNotification("user@example.com", newIphone);
            Thread.sleep(5); // Имитация задержки между отправками
        }

        try {
            service.sendNotification("user@example.com", newIphone);
        } catch (Exception e) {
            System.out.println("Лимит сработал: " + e.getMessage());
        }

        Thread.sleep(1100);

        for (int i = 0; i < 100; i++) {
            service.sendNotification("user@example.com", newIphone);
            Thread.sleep(5);
        }
        System.out.println("Скользящее окно работает: лимит обновлён");
    }
}