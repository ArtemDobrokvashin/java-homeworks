package main.service;

import main.model.*;

public class BonusCalculator {

    public void calculateAndAssignBonus(Employee employee, KpiData kpiData) {
        if (employee instanceof Manager){
            double bonus = kpiData.getSalesAmount() * 0.1;
            employee.addBonus(bonus);
        }
        if (employee instanceof SmmManager){
            double bonus = kpiData.getNewSubscribers() * 2;
            employee.addBonus(bonus);
        }
        if (employee instanceof Engineer){
            double bonus = kpiData.getCompletedTasks() * 100;
            employee.addBonus(bonus);
        }
    }
}
