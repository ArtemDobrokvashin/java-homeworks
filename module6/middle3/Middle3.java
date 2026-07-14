package module6.middle3;

import java.util.Scanner;

public class Middle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        new module6.middle3.Game(name).start();
    }
}
