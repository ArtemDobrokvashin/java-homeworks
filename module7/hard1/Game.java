package module7.hard1;

import hard1.Word;
import middle1.Player;

public class Game {
    private Word word;
    private Player wordSetter;
    private Player guesser;
    private int wrongAttempts;
    private static final int MAX_ATTEMPTS = 6;

    public Game(Player wordSetter, Player guesser) {
        this.wordSetter = wordSetter;
        this.guesser = guesser;
        this.wrongAttempts = 0;
    }

    public void playGame() {
        System.out.println("Добро пожаловать в игру 'Виселица'!");
        System.out.println("Игрок 1, загадайте слово (второй игрок не подглядывает!):");

        String secretWord = wordSetter.in();
        this.word = new Word(secretWord);

        while (!word.isGuessed() && wrongAttempts < MAX_ATTEMPTS) {
            System.out.println("\nТекущее слово: " + word.getDisplay());
            System.out.println("Ошибок: " + wrongAttempts + "/" + MAX_ATTEMPTS);
            System.out.println("Игрок 2, введите букву:");

            char guess = guesser.guessLetter();

            if (word.openLetter(guess)) {
                System.out.println("Есть такая буква!");
            } else {
                wrongAttempts++;
                System.out.println("Нет такой буквы!");
            }
        }

        // Объявление результата
        if (word.isGuessed()) {
            guesser.incrementScore();
            System.out.println("\nПоздравляем! Игрок 2 победил!");
        } else {
            wordSetter.incrementScore();
            System.out.println("\nИгрок 1 победил!");
            System.out.println("Загаданное слово было: " + word.getHiddenWord());
        }

        // Вывод счёта
        System.out.println("\nСчёт:");
        System.out.println("Игрок 1: " + wordSetter.getScore());
        System.out.println("Игрок 2: " + guesser.getScore());
    }
}