package middle1;
public class DrinkShopFacade {
    private Drink drink;

    private Handler firstHandler;

    public DrinkShopFacade() {
        // Строим цепочку обработчиков
        Handler menuHandler = new MenuCheckHandler();
        Handler paymentHandler = new PaymentCheckHandler();

        menuHandler.setNext(paymentHandler);

        firstHandler = menuHandler;
    }

    public void orderDrink(String drinkName) {
        System.out.println("\n=== Новый заказ: " + drinkName + " ===");

        boolean canProcess = firstHandler.handle(drinkName, this);

        if (!canProcess) {
            System.out.println("Заказ не может быть обработан\n");
            return;
        }

        createDrink(drinkName);

        if (drink != null) {
            System.out.println("\nПриготовление напитка:");
            drink.makeDrink();
            drink.pourIntoCup();
            System.out.println("Ваш напиток готов! Спасибо, приходите еще!\n");
        }
    }

    private void createDrink(String drinkName) {
        switch (drinkName.toLowerCase()) {
            case "coffee":
                drink = new Coffee();
                break;
            case "juice":
                drink = new Juice();
                break;
            case "tea":
                drink = new Tea();
                break;
            default:
                drink = null;
        }
    }
}