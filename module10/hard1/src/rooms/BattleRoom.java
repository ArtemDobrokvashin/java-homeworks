package hard1.src.rooms;

import characters.Goblin;
import core.Hero;
import skills.IronFlesh;
import skills.Skill;

import java.util.Random;
import java.util.Scanner;

public class BattleRoom extends Room {

    @Override
    public void enter(Hero hero, Scanner sc) {
        Random rnd = new Random();
        Goblin goblin = new Goblin();

        System.out.println("Вы встретили Гоблина, который категорически хочет вас убить!\nАтакуйте первым!");

        while (hero.isAlive() && goblin.isAlive()) {
            System.out.println("\nУ вас " + hero.getCurrentHealth() + " HP");
            System.out.println("У противника " + goblin.getCurrentHealth() + " HP");

            System.out.println("Твои действия, герой:\n" +
                    "[1] Атаковать, что ж еще?!\n" +
                    "[2] Беги, Форест, беги!\n" +
                    "[3] Достать щит!");

            int chooseForAction = sc.nextInt();
            switch (chooseForAction) {
                case 1:
                    hero.attack(goblin);
                    if (goblin.isAlive()) {
                        goblin.attack(hero);
                    }
                    break;

                case 2:
                    System.out.println("О наш герой, ты решил сбежать? Шанс на побег у тебя 50/50");
                    if (rnd.nextBoolean()) {
                        System.out.println("На этот раз повезло. Но только в этот раз");
                        return;
                    } else {
                        System.out.println("Не вышло! Гоблин смеётся и атакует.");
                        goblin.attack(hero);
                    }
                    break;

                case 3:
                    System.out.println("Ты, почти как герой, достаешь откуда-то свой щит.\n" +
                            "Щит не выглядит надежным, но попытка не пытка...\n" +
                            "Случай и Бог рандома скажет, повезло ли тебе");

                    int roll = rnd.nextInt(11);
                    int baseDamage = goblin.getWeapon().getDamage();

                    if (roll <= 4) {
                        System.out.println("Воу-воу, тебе повезло! Урон полностью заблокирован.");
                    } else if (roll <= 8) {
                        int damage = baseDamage / 2;
                        hero.takeDamage(damage);
                        System.out.println("Почти получилось. Ты смог защититься от удара, но частично все же потерял HP");
                    } else {
                        int damage = (int) (baseDamage * 0.75);
                        hero.takeDamage(damage);
                        System.out.println("В суматохе, ты принял за щит какую-то картонку. Но это отвлекло Гоблина и ты смог снизить урон");
                    }
                    System.out.println("У тебя осталось: " + hero.getCurrentHealth() + " HP");
                    break;

                default:
                    System.out.println("Неверный выбор! Попробуй снова.");
                    break;
            }
        }

        // Определение исхода боя
        if (hero.isAlive() && !goblin.isAlive()) {
            System.out.println("\nВы победили!");
            Skill skill = new IronFlesh();
            skill.apply(hero);
            System.out.println("Получен навык: " + skill.getName());
        } else if (!hero.isAlive()) {
            System.out.println("\nРосКомНадзор заблокировал тебя. Wasted.");
        }
        // Если сбежал — просто вышли через return
    }
}