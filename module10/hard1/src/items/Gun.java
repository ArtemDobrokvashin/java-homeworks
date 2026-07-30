package hard1.src.items;

public class Gun implements Weapon{
    @Override
    public int getDamage() {
        return 35;
    }

    @Override
    public String getName() {
        return "Пистолет";
    }
}
