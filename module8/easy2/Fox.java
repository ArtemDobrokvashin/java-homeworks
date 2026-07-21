

public class Fox extends Animal{
    @Override
    public void walk() {
        System.out.println(getClass().getSimpleName() + " Очень тихо ходит");
    }

    @Override
    public void say() {
        System.out.println(getClass().getSimpleName() + " What does the fox say? Gering-ding-ding-ding-dingeringeding! © Ylvis 2013");
    }
}
