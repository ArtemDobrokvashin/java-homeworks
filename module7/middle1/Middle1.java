package module7.middle1;

import middle1.Player;
import middle1.Thimble;

import java.util.Scanner;

public class Middle1 {
    public static void main(String[] args) {

        Thimble thimble = new Thimble();//создали игру
        Player player = new Player();// создалии игрока

        Scanner scanner = new Scanner(System.in);//создали сканер для пользовательского ввода

        System.out.println("Введите номер наперстка");
        int answer = scanner.nextInt();//считываем ответ игрока
        int realNumber = thimble.showNumberThimble();//получаем ответ от компьютера
        if (answer == realNumber) {//сравниваем ответы
            player.increaseWinCounter();
        }
        System.out.println("Ваш результат: " + player.getWinCounter());
    }
}
