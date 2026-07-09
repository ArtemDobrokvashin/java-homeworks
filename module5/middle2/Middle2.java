package module5.middle2;

import java.util.Random;
import java.util.Scanner;

public class Middle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeArray = -1;
        Random random = new Random();

        while (sizeArray < 0 || sizeArray > 100) {
            System.out.println("Введите размер массива от 1 до 100");
            sizeArray = sc.nextInt();

            if (sizeArray < 1 || sizeArray > 100) {
                System.out.println("Ошибка ввода. Неправильный диапазон.");
            }
        }

        double[] randomArray = new double[sizeArray];
        System.out.println("Внимание, происходит магия...");
        for (int i = 0; i < sizeArray; i++) {
            randomArray[i] = random.nextDouble() * 200 - 100;
            System.out.println("Сгенерировано число " + randomArray[i]);
        }
        System.out.println();

        double maxAbs = randomArray[0];
        for (int i = 1; i < sizeArray; i++) {
            if (Math.abs(randomArray[i]) > Math.abs(maxAbs)) {
                maxAbs = randomArray[i];
            }
        }
        System.out.println(maxAbs);
    }
}
