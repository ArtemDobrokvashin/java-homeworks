package hard1.controller;

import hard1.model.*;
import hard1.view.*;

public class CipherController {

    private final FileCipherService service;
    private final ConsoleView view;

    public CipherController(FileCipherService service, ConsoleView view) {
        if (service == null) {
            throw new IllegalArgumentException("File cipher service is null");
        }
        if (view == null) {
            throw new IllegalArgumentException("Console view is null");
        }
        this.service = service;
        this.view = view;
    }

    public void run(){
        while (true) {
            view.showMessage("1. Зашифровать файл");
            view.showMessage("2. Расшифровать файл");
            view.showMessage("0. Выход");

            int choice = view.readMenuChoice("Выберете пункт: ");
            switch (choice) {
                case 0 -> {
                    view.showMessage("Пока");
                    return;
                }
                case 1, 2 -> {
                    String input = view.readLine("Путь к входному файлу: ");
                    String output = view.readLine("Путь к выходному файлу: ");
                    int key = view.readInt("Введите значение смещения: ");

                    try {
                        service.process(input, output, choice == 1, key);
                        view.showMessage("Готово. Результат находится " + output);
                    }
                    catch (IllegalStateException e){
                        view.showMessage("Ошибка " + e.getMessage());
                    }
                }
                default -> view.showMessage("Нет такого пункта");

            }
        }
    }

}
