package main.model;

import java.util.List;

public class Engineer extends Employee{
    public Engineer(String firstName, String lastName, double baseSalary, List<Double> bonuses) {
        super(firstName, lastName, baseSalary, bonuses);
    }
}
