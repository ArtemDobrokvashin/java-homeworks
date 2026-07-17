package module7.middle2;

import java.util.Scanner;

public class Player {
    private Scanner scanner;

    public Player(){
        this.scanner = new Scanner(System.in);
    }

    public int guessNumber(){
        System.out.println("Введите число от 1 до 10");
        return scanner.nextInt();
    }
}
