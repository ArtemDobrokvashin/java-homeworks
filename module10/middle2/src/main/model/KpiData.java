package main.model;

public class KpiData {
    private double salesAmount;
    private int completedTasks;
    private int newSubscribers;
    private int attendanceDays;

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    public int getCompletedTasks() {
        return completedTasks;
    }

    public void setCompletedTasks(int completedTasks) {
        this.completedTasks = completedTasks;
    }

    public int getNewSubscribers() {
        return newSubscribers;
    }

    public void setNewSubscribers(int newSubscribers) {
        this.newSubscribers = newSubscribers;
    }

    public int getAttendanceDays() {
        return attendanceDays;
    }

    public void setAttendanceDays(int attendanceDays) {
        this.attendanceDays = attendanceDays;
    }
}
