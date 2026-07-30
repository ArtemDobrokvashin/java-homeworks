package hard1.src.rooms;

import core.Hero;

import java.util.Scanner;

public class HealingRoom extends Room{
    @Override
    public void enter(Hero hero, Scanner scanner) {
        System.out.println("Тебе везет, ты нашел бутылку старого рома и аспирин");
        hero.heal(20);
        System.out.println("Получено +20 HP");
    }
}
