package module7.hard1;

import java.util.Scanner;

public class Player {
    private int score = 0;

    public String provideWord(){
        System.out.println("Игрок 1, введите свое слово:");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().toLowerCase();
    }

    public char guessLetter(){
        System.out.println("Рискните и введите букву:");
        Scanner sc = new Scanner(System.in);
        return Character.toLowerCase(sc.nextLine().charAt(0));
    }

    public void incrementScore(){
        score++;
    }

    public int getScore(){
        return score;
    }


}
