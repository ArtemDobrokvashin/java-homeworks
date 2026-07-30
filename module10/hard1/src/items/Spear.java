package hard1.src.items;

public class Spear implements Weapon{
    @Override
    public int getDamage() {
        return 25;
    }

    @Override
    public String getName() {
        return "Копьё";
    }
}
