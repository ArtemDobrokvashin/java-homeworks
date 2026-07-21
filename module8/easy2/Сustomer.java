

public class Сustomer extends Animal{
    @Override
    public void walk() {
        System.out.println(getClass().getSimpleName() + " Шлеп-шлеп");

    }

    @Override
    public void say() {
        System.out.println(getClass().getSimpleName() + " Я тут правки вам принес, надо срочно внести и до вечера пятницы выкатить в прод");
    }
}
