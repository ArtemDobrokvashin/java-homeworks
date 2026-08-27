package middle1;

public class PaymentCheckHandler extends Handler {
    @Override
    public boolean handle(String drinkName, DrinkShopFacade facade) {
        System.out.println("Проверяем оплату...");
        boolean paymentSuccess = Math.random() > 0.1; // 90% успеха

        if (paymentSuccess) {
            System.out.println("Оплата прошла успешно");
            return true;
        } else {
            System.out.println("Ошибка оплаты. Проверьте данные карты.");
            return false;
        }
    }
}