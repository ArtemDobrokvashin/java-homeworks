package module5.hard1;

import java.util.Scanner;

public class Hard1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько чисел Фибоначчи вывести?");
        int numOfFibonacci = sc.nextInt();

        int[] arr = new int[numOfFibonacci];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
