package main.model;

import java.util.List;

public class Manager extends Employee {
    public Manager(String firstName, String lastName, double baseSalary, List<Double> bonuses) {
        super(firstName, lastName, baseSalary, bonuses);
    }
}
