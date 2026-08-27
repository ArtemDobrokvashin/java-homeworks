package middle1;

public class DrinkShop {
    public Drink orderDrink(String type) {
        Drink drink = null;

        if ("coffee".equals(type)) {
            drink = new Coffee();
        } else if ("juice".equals(type)) {
            drink = new Juice();
        }

        drink.makeDrink();
        drink.pourIntoCup();

        System.out.println("Вот ваш напиток! Спасибо, приходите еще!");
        return drink;
    }
}
