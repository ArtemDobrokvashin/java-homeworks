package module5.middle3;

import java.util.Scanner;

public class Middle3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNum = -1;
        while (userNum < 1 || userNum > 100){
            System.out.println("ведите число в диапазоне от 1 до 100");
            userNum = sc.nextInt();
            if (userNum < 1 || userNum > 100){
                System.out.println("Неправильный ввод. Повторите попытку");
            }
        }

        for (int i = 2; i <= userNum/2; i++){
            if (userNum % i ==0){
                System.out.print(i + " ");
            }
        }
    }
}
