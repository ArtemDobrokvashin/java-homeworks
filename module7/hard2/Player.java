package module7.hard2;

import java.util.Scanner;

public class Player {
    private Scanner scanner;
    private int score = 0;

    public Player() {
        this.scanner = new Scanner(System.in);
    }

    public int choose() {
        System.out.println("Введите число от 1 до 4, где:" + "\n" +
                "1 - Камень" + "\n" +
                "2 - Ножницы" + "\n" +
                "3 - Бумага" + "\n" +
                "4 - Колодец");
        return scanner.nextInt();
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
}