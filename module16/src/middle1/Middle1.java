package middle1;

public class Middle1 {
    public static void main(String[] args) {
        DrinkShopFacade shop = new DrinkShopFacade();

        shop.orderDrink("Coffee");
        shop.orderDrink("Juice");
        shop.orderDrink("Tea");
        shop.orderDrink("Cola"); // Нет в меню
    }
}