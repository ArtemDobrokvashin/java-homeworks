package module7.middle4;

import java.util.Random;

public class Middle4 {

    public static void main(String[] args) {
        Random random = new Random();
        module7.middle4.Frog frog1 = new module7.middle4.Frog();
        module7.middle4.Frog frog2 = new module7.middle4.Frog();
        while (true) {
            int roll1 = random.nextInt(6) + 1;
            frog1.jump(roll1);
            if (frog1.hasWon()) {
                System.out.println("Игрок 1 выиграл!");
                break;
            }

            int roll2 = random.nextInt(6) + 1;
            frog2.jump(roll2);
            if (frog2.hasWon()) {
                System.out.println("Игрок 2 выиграл!");
                break;
            }
        }

    }
}
