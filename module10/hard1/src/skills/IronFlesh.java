package hard1.src.skills;
import core.Hero;
public class IronFlesh implements Skill{
    @Override
    public String getName() {
        return "Железная плоть";
    }

    @Override
    public void apply(Hero hero) {
        hero.increaseMaxHealth(10);
    }
}
