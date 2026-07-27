package service;

import model.Priority;
import model.Status;
import model.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskManager {
    private final ArrayList<Task> tasks = new ArrayList<>();

    public List<Task> getTasks() {
        return Collections.unmodifiableList(tasks);
    }

    public void addTask(Task task) {
        if (task == null) {
            throw new IllegalArgumentException("Задача не может быть null");
        }
        tasks.add(task);
    }

    public boolean removeTask(Long id) {
        return tasks.removeIf(task -> task.getId().equals(id));
    }

    public void executeTask(Long id) {
        Task targetTask = null;

        for (Task task : tasks) {
            if (task.getId() != null && task.getId().equals(id)) {
                targetTask = task;
                break;
            }
        }
        if (targetTask == null) {
            throw new IllegalArgumentException("Задача с ID " + id + " не найдена");
        }

        Status status = targetTask.getStatus();
        if (status == Status.TODO || status == Status.IN_PROGRESS) {
            targetTask.execute();
        }


    }

    public void markAsDone(long id) {
        boolean found = false;
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                task.setStatus(Status.DONE);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new IllegalArgumentException("Задача с таким ID " + id + " не найдена");
        }
    }

    public List<Task> getTasksByStatus(Status status) {
        ArrayList<Task> taskArrayList = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getStatus().equals(status)) {
                taskArrayList.add(task);
            }
        }
        return taskArrayList;

    }

    public List<Task> getTasksByPriority(Priority priority) {
        ArrayList<Task> taskArrayList = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getPriority().equals(priority)) {
                taskArrayList.add(task);
            }
        }
        return taskArrayList;
    }


}
