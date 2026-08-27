package middle1;

public class Juice extends Drink {
    @Override
    public void makeDrink() {
        System.out.println("Берем любой фрукт");
        System.out.println("Безжалостно давим");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Наливаем в стакан сок из того, что было");
    }
}