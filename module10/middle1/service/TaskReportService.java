package service;

import model.Priority;
import model.Status;
import model.Task;

import java.util.List;

public class TaskReportService implements Reportable {
    private TaskManager manager;

    public TaskReportService(TaskManager manager) {
        this.manager = manager;
    }

    @Override
    public String generateReport() {
        List<Task> allTasks = manager.getTasks();
        int totalTasks = allTasks.size();
        int todoCount = manager.getTasksByStatus(Status.TODO).size();
        int inProgressCount = manager.getTasksByStatus(Status.IN_PROGRESS).size();
        int doneCount = manager.getTasksByStatus(Status.DONE).size();

        int lowCount = manager.getTasksByPriority(Priority.LOW).size();
        int mediumCount = manager.getTasksByPriority(Priority.MEDIUM).size();
        int highCount = manager.getTasksByPriority(Priority.HIGH).size();

        return "=== ОТЧЁТ ПО ЗАДАЧАМ ===\n" +
                "Всего задач: " + totalTasks + "\n" +
                "Статусы:\n" +
                "  TODO: " + todoCount + "\n" +
                "  IN_PROGRESS: " + inProgressCount + "\n" +
                "  DONE: " + doneCount + "\n" +
                "Приоритеты:\n" +
                "  LOW: " + lowCount + "\n" +
                "  MEDIUM: " + mediumCount + "\n" +
                "  HIGH: " + highCount;


    }


}