package hard1.src.characters;

import items.Gun;
import items.Spear;
import items.Weapon;
import items.Sword; // или любое оружие по умолчанию

import java.util.Random;

public class Goblin extends Fighter {

    private static final Random rand = new Random();

    public Goblin() {
        super(90, getRandomWeapon());
    }

    private static Weapon getRandomWeapon() {
        return switch (rand.nextInt(3)) { // 0, 1, 2
            case 0 -> new Sword();
            case 1 -> new Spear();
            case 2 -> new Gun();
            default -> new Sword(); // на всякий случай
        };
    }

    @Override
    public void attack(Fighter target) {
        int damage = calculateDamage();
        Weapon weapon = getWeapon();

        if (damage == 0) {
            System.out.println("Гоблин промахнулся!");
        } else if (damage == weapon.getDamage() * 2) {
            System.out.println("Гоблин нанёс КРИТИЧЕСКИЙ удар! Урон: " + damage);
        } else {
            System.out.println("Гоблин атакует! Урон: " + damage);
        }

        target.takeDamage(damage);
    }
}