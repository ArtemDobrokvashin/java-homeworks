package module6.middle4;

import java.util.Scanner;

public class Middle4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Игрок 1 вводит имя: ");
        Player p1 = new Player(sc.nextLine(), 0);
        System.out.println("Игрок 2 вводит имя: ");
        Player p2 = new Player(sc.nextLine(), 0);
        new Game(p1, p2).start();

        System.out.println("У игрока " + p1.getName() + " " + p1.getWins() + " побед");
        System.out.println("У игрока " + p2.getName() + " " + p2.getWins() + " побед");

    }
}
