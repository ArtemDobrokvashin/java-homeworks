package middle6;

import java.util.Random;
import java.util.Scanner;

public class Middle6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Test your luck");
        int percentageOfCorrectAnswers = 0;
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int a = random.nextInt(9) + 1;
            int b = random.nextInt(9) + 1;
            System.out.println("Сколько будет " + a + " * " + b);
            int c = sc.nextInt();

            if (c == a * b){
                System.out.println("Абсолютли");
                count += 1;
            } else {
                System.out.println("Не правильно "+ a + " * " + b + " = " + a * b);
            }
        }
        percentageOfCorrectAnswers = (count * 100) / 5;
        System.out.println("Процент правильных ответов: " + percentageOfCorrectAnswers + "%");
    }
}
