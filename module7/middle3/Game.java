package module7.middle3;

import java.util.Random;

public class Game {
    private int choose;

    public Game(int choose) {
        this.choose = choose;
    }

    public void start() {
        Things playerChoice = Things.fromGame(this.choose);
        Things bot = Things.values()[new Random().nextInt(3)];

        if (playerChoice == bot) {
            System.out.println("Ничья. Оба выбрали " + playerChoice);
        } else if (
                (playerChoice == Things.КАМЕНЬ && bot == Things.НОЖНИЦЫ) ||
                        (playerChoice == Things.НОЖНИЦЫ && bot == Things.БУМАГА) ||
                        (playerChoice == Things.БУМАГА && bot == Things.КАМЕНЬ)
        ) {
            System.out.println("Вы победили. Бот выбрал " + bot);
        } else {
            System.out.println("Бот выиграл, он выбрал " + bot);
        }
    }
}