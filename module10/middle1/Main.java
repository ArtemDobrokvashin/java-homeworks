import model.CategorizedTask;
import model.Priority;
import model.Task;
import service.Reportable;
import service.TaskManager;
import service.TaskReportService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();
        // Добавляем задачи
        manager.addTask(new CategorizedTask("Купить хлеб", "В магазине", Priority.LOW, LocalDateTime.of(2025, 12 , 11, 10, 35),"Дом"));
        manager.addTask(new CategorizedTask("Изучить Java", "OOP", Priority.HIGH,"Учёба"));
        // ... и ещё 2-3 задачи с разными статусами

        // Меняем статус одной задачи вручную (или через markAsDone)
        // Выполняем задачу
        manager.executeTask(1L);

        // Генерируем отчёт
        Reportable reporter = new TaskReportService(manager);
        System.out.println(reporter.generateReport());
    }

}