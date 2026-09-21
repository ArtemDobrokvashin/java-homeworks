package middle3;

import javax.swing.*;
import java.util.Random;


public class Middle3 {
    public static void main(String[] args) {


        Random rand = new Random();
        int secretNumber = rand.nextInt(100) + 1;
        int counter = 1;
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Введи число (попытка " + counter + "):");
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Вы ничего не ввели. Загаданное число было " + secretNumber);
                break;
            }
            try {
                if (input.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Пустой ввод. Введите число");
                    continue;
                }
                int number = Integer.parseInt(input);
                if (number < secretNumber) {
                    JOptionPane.showMessageDialog(null, "Загаданное число больше");
                    counter++;
                } else if (number > secretNumber) {
                    JOptionPane.showMessageDialog(null, "Загаданное число меньше.");
                    counter++;
                } else {
                    JOptionPane.showMessageDialog(null, "Поздравляю! Вы отгадали. Попыток: " + counter);
                    break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Вы ввели не число",
                        "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            }


        }

    }

}
