package model;

import java.time.LocalDateTime;

import java.util.concurrent.atomic.AtomicLong;

public abstract class Task {
    private final Long id;
    private static final AtomicLong nextId = new AtomicLong(1);
    protected String title;
    protected String description;
    protected Priority priority;
    private final LocalDateTime createdAt;
    private LocalDateTime deadline;
    private Status status = Status.TODO;


    public Task(String title, String description, Priority priority) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Название задачи не должно быть пустым");
        }
        this.title = title;
        this.description = description != null ? description : "Добавьте описание задачи";

        if (priority == null) {
            throw new IllegalArgumentException("Приоритет не может быть пустым");
        }

        this.priority = priority;
        this.id = nextId.getAndIncrement();
        this.createdAt = LocalDateTime.now();
        this.deadline = null;


    }

    public Task(String title, String description, Priority priority, LocalDateTime deadline){
        this(title, description, priority);
        setDeadline(deadline);
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        if (priority == null) {
            throw new IllegalArgumentException("Приоритет не может быть пустым");
        }
        this.priority = priority;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Заголовок не может быть пустым");
        }
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        if (status == null){
            throw new IllegalArgumentException("Укажите статус задачи");
        }
        this.status = status;
    }

    public abstract void execute();


    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        if (deadline != null && deadline.isBefore(LocalDateTime.now())){
            throw new IllegalArgumentException("Дата не может быть в прошлом");
        }
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                ", deadline=" + (deadline != null ? deadline : "не задан") +
                ", createdAt=" + createdAt +
                '}';
    }
}
