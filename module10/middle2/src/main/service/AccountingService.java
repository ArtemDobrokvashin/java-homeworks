package main.service;

import main.model.Payable;

import java.util.ArrayList;
import java.util.List;

public class AccountingService {
    public List<String> getSalarySummary(List<Payable> employees) {
        List<String> salary = new ArrayList<>();
        for (Payable payable : employees) {
            String fullName = payable.getFirstName() + " " + payable.getLastName();
            double total = payable.calculateTotalSalary();
            salary.add(fullName + ": " + total);
        }
        return salary;
    }
}