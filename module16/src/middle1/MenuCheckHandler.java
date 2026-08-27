package middle1;

public class MenuCheckHandler extends Handler {
    @Override
    public boolean handle(String drinkName, DrinkShopFacade facade) {
        System.out.println("Проверяем меню...");

        if ("Coffee".equalsIgnoreCase(drinkName) ||
                "Juice".equalsIgnoreCase(drinkName) ||
                "Tea".equalsIgnoreCase(drinkName)) {
            System.out.println("Напиток '" + drinkName + "' есть в меню");
            if (getNext() != null) {
                return getNext().handle(drinkName, facade);
            }
            return true;
        } else {
            System.out.println("Извините, напитка '" + drinkName + "' нет в нашем меню");
            return false;
        }
    }
}