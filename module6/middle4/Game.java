package middle4;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Player p1;
    private Player p2;
    private int currentSum;
    private int targetNum;
    Scanner sc = new Scanner(System.in);

    public Game(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        Random rnd = new Random();
        targetNum = rnd.nextInt(100) + 1;
        currentSum = 0;
    }

    public void start() {
        System.out.println("Да начнется битва");
        while (currentSum <= targetNum) {
            if (makeMove(p1)) {
                System.out.println("Игрок " + p2.getName() + " красучег");
                p2.incrementWins();
                break;
            }
            if (makeMove(p2)) {      // аналогично
                System.out.println(p1.getName() + " победил!");
                p1.incrementWins();
                break;
            }

        }


    }

    public boolean makeMove(Player player) {
        System.out.println("Ход игрока " + player.getName());
        currentSum += sc.nextInt();
        return currentSum > targetNum;
    }
}
