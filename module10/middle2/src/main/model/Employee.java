package main.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee implements Payable {
    private String firstName;
    private String lastName;
    private double baseSalary;
    private List<Double> bonus;

    public Employee(String firstName, String lastName, double baseSalary, List<Double> bonus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
        this.bonus = new ArrayList<>(bonus);
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public double calculateTotalSalary() {
        double total = baseSalary;
        for (Double b : bonus) {
            total += b;
        }
        return total;
    }

    public void addBonus(double amount) {
        bonus.add(amount);
    }
}