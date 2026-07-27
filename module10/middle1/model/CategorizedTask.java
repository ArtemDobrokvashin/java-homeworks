package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class CategorizedTask extends Task {
    private String category;

    public CategorizedTask(String title, String description, Priority priority, LocalDateTime deadline, String category) {
        super(title, description, priority, deadline);
        this.category = category;
    }
    public CategorizedTask(String title, String description, Priority priority, String category) {
        super(title, description, priority);
        this.category = category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public void execute() {
        StringBuilder message = new StringBuilder("Выполняется задача ");
        message.append(getTitle());

        String category = getCategory();
        if (getCategory() != null && !getCategory().trim().isEmpty()){
            message.append(" в категории ").append(category);
        }

        LocalDateTime deadline = getDeadline();
        if (deadline != null){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd.MM.yyyy");
            message.append(". Дедлайн: ").append(deadline.format(formatter));
        }

        System.out.println(message.toString());

    }

    @Override
    public String toString() {
        return super.toString() + "category: " + category;
    }
}
