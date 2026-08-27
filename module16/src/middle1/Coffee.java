package middle1;

public class Coffee extends Drink {
    @Override
    public void makeDrink() {
        System.out.println("Берем зерна арабики и мелим их");
        System.out.println("Варим кофе в турке");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Наливаем кофе в стакан");
    }
}