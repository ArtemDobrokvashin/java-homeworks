package hard1.src.characters;

import items.Weapon;

import java.util.Random;

public abstract class Fighter {
    private int currentHealth;
    private int maxHealth;
    private Weapon weapon;
    private Random rand = new Random();

    public Fighter(int maxHealth, Weapon weapon) {
        this.currentHealth = maxHealth;
        this.maxHealth = maxHealth;
        this.weapon = weapon;
    }

    public boolean isAlive() {
        return currentHealth > 0;
    }

    public void takeDamage(int damage) {
        currentHealth = Math.max(0, currentHealth - damage);
    }

    public void heal(int amount) {
        currentHealth = Math.min(maxHealth, currentHealth + amount);
    }

    public int calculateDamage() {
        double chance = rand.nextDouble();
        int weaponDamage = weapon.getDamage();

        if (chance < 0.3) {
            return 0;
        } else if (chance < 0.9) {
            return weaponDamage;
        } else {
            return weaponDamage * 2;
        }
    }

    public abstract void attack(Fighter target);

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
}
