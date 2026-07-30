package hard1.src.items;

public class Sword implements Weapon{
    @Override
    public int getDamage() {
        return 15;
    }

    @Override
    public String getName() {
        return "Меч святой бороды";
    }
}
