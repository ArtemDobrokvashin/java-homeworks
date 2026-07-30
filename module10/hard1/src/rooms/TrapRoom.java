package hard1.src.rooms;

import core.Hero;

import minigame.rockpaperscissors.Things;

import java.util.Random;
import java.util.Scanner;

public class TrapRoom extends Room {


    @Override
    public void enter(Hero hero, Scanner sc) {
        System.out.println("It's a Trap!\nДавай сыграем в игру...\nИграем в камень-ножницы-бумага");

        while (true) {
            System.out.println("Введите число от 1 до 3:\n1 - Камень\n2 - Ножницы\n3 - Бумага");
            int choice = sc.nextInt();
            Things playerChoice = Things.fromGame(choice);
            Things bot = Things.values()[new Random().nextInt(3)];

            if (playerChoice == bot) {
                System.out.println("Ничья. Оба выбрали " + playerChoice + ". Играем ещё!");
            } else if (
                    (playerChoice == Things.КАМЕНЬ && bot == Things.НОЖНИЦЫ) ||
                            (playerChoice == Things.НОЖНИЦЫ && bot == Things.БУМАГА) ||
                            (playerChoice == Things.БУМАГА && bot == Things.КАМЕНЬ)
            ) {
                System.out.println("Вы победили! Гоблин выбрал " + bot + ".");
                hero.heal(10);
                break;
            } else {
                System.out.println("Гоблин выиграл, он выбрал " + bot + ".");
                hero.takeDamage(10);
                System.out.println("У тебя минус 10 HP. Текущее здоровье " + hero.getCurrentHealth() + " HP");
                if (!hero.isAlive()) {
                    System.out.println("Ты погиб в ловушке...");
                }
                break;
            }
        }
    }
}

