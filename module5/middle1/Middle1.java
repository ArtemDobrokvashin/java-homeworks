package module5.middle1;

import java.util.Random;
import java.util.Scanner;

public class Middle1 {
    public static void main(String[] args) {
        System.out.println("Укажите размер массива. Массив генерируется из случайных чисел");
        Scanner sc = new Scanner(System.in);
        int sizeArr = sc.nextInt();
        Random random = new Random();
        int[] arrInt = new int[sizeArr];

        int sum = 0;
        for (int i = 0; i < sizeArr; i++) {
            arrInt[i] = random.nextInt();
            sum += arrInt[i];
        }


        System.out.println("Сумма всех чисел массива " + sum);
        for (int i = 0; i < sizeArr; i++){
            System.out.println("Элементы массива " + arrInt[i]);
        }

    }
}
