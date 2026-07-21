
public class Cat extends Animal {
    @Override
    public void walk() {
        System.out.println(getClass().getSimpleName() + " Дрыхнет чаще, чем ходит");
    }

    @Override
    public void say() {
        System.out.println(getClass().getSimpleName() + " МЯУ");
    }
}
