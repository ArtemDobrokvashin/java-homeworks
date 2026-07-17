package module7.middle2;


import java.util.Random;

public class Game {

    private int secretNumber;
    private boolean isLimited;
    private int maxAttempts;
    private Player player;

    public Game(Player player, boolean isLimited, int maxAttempts) {
        if (isLimited == true && maxAttempts < 1) {
            throw new IllegalArgumentException("Попыток должно быть ≥ 1");
        }
        this.player = player;
        this.secretNumber = createSecretNumber();
        this.isLimited = isLimited;
        this.maxAttempts = maxAttempts;

    }

    public int createSecretNumber() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public void start() {
        int attempts = 0;

        while (!isLimited || attempts < maxAttempts) {
            attempts++;
            int playerNum = player.guessNumber();
            if (playerNum == secretNumber) {
                System.out.println("Вы выиграли! Количество Ваших попыток: " + attempts);
                return;
            }
            if (playerNum > secretNumber) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }

        if (isLimited) {
            System.out.println("Вы проиграли. Загаданное число было: " + secretNumber);
        }
    }
}
