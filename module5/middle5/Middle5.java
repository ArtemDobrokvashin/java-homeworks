package middle5;

import java.util.Random;
import java.util.Scanner;

public class Middle5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = -1;

        while (arraySize < 1 || arraySize > 10) {
            System.out.println("Введите размер массива от 1 до 10");
            arraySize = sc.nextInt();

            if (arraySize < 1 || arraySize > 10) {
                System.out.println("Указан неверный размер массива");
            }
        }

        int[][] userArray = new int[arraySize][arraySize];

        Random random = new Random();

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                userArray[i][j] = random.nextInt(21) - 10;
            }

        }

        System.out.println("Сгенерированный массив размером " + arraySize + " на " + arraySize);
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                System.out.print(userArray[i][j] + " ");
            }
            System.out.println();

        }

        int sum = 0;

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                if (i == j) {
                    sum += userArray[i][j];
                }

            }

        }

        System.out.println("Сумма главной диагонали массива " + sum);

    }

}
