package hard1.src.core;

import characters.Fighter;
import items.Weapon;

public class Hero extends Fighter {
    private String name;

    public Hero(int maxHp, Weapon weapon, String name) {
        super(maxHp, weapon); // ← правильно: maxHp + Weapon
        this.name = name;
    }

    @Override
    public void attack(Fighter target) { // ← Fighter, не Character
        int damage = calculateDamage();
        Weapon weapon = getWeapon(); // ← получаем из родителя

        if (damage == 0) {
            System.out.println(name + " промахнулся!");
        } else if (damage == weapon.getDamage() * 2) {
            System.out.println("КРИТ! " + name + " нанёс " + damage + " урона!");
        } else {
            System.out.println(name + " нанёс " + damage + " урона.");
        }

        target.takeDamage(damage);
    }

    public void increaseMaxHealth(int amount) {
        // если в Fighter есть setMaxHealth и setCurrentHealth — ок
    }

    public String getName() {
        return name; // ← просто возвращаем, без присваивания
    }
}