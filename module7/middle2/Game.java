package module7.middle2;

import java.util.Random;

public class Game {

    private int secretNumber;
    private boolean isLimited;
    private int maxAttempts;

    public Game(boolean isLimited, int maxAttempts) {
        if (isLimited == true && maxAttempts < 1) {
            throw new IllegalArgumentException("Попыток должно быть ≥ 1");
        }

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

        if (isLimited == true) {
            while (attempts < maxAttempts) {
                attempts++;
                int playerNum = player.guessNumber(); //пока так, потом перепишу
                if (playerNum == secretNumber){
                    System.out.println("Вы выйграли. Количество Ваших попыток: " + attempts);
                    break;
                }
            }
        }
    }
}
