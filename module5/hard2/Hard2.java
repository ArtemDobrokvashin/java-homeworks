package module5.hard2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hard2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = -1;

        while (arraySize < 1 || arraySize > 1000) {

            System.out.println("Введите размер массива");
            arraySize = sc.nextInt();

            if (arraySize < 1 || arraySize > 1000) {
                System.out.println("Введен некорректное значение");
            }
        }

        int[] userArray = new int[arraySize];
        System.out.println("Заполняем массив размером " + arraySize);


        for (int i = 0; i < arraySize; i++) {
            int value = sc.nextInt();
            while (value > 1000 || value < 1) {
                System.out.println("Значение должно быть от 1 до 1000. Введите снова:");
                value = sc.nextInt();
            }
            userArray[i] = value;
        }

        Map<Integer, Integer> periodicity = new HashMap<>();
        for (int num : userArray) {
            periodicity.put(num, periodicity.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (int num : userArray) {
            if (periodicity.get(num) == 1) {
                count += 1;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int num : userArray) {
            if (periodicity.get(num) == 1) {
                result[index++] = num;
            }
        }

        System.out.println("Массив без дублей: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
