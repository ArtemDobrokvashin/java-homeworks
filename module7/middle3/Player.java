package module7.middle3;

import java.util.Scanner;

public class Player {
    private Scanner scanner;

    public Player(){
        this.scanner = new Scanner(System.in);
    }

    public int choose(){
        System.out.println("Введите число от 1 до 3, где:" + "\n" + "1 - Камень" + "\n" + "2 - Ножницы" + "\n" + "3 - Бумага");
        return scanner.nextInt();
    }
}
