package middle1;

public class Tea extends Drink {
    @Override
    public void makeDrink() {
        System.out.println("Чай заваривается");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Наливаем чай в чайник");
    }
}