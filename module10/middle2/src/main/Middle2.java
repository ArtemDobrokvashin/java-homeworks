package main;

import main.model.*;
import main.service.AccountingService;
import main.service.BonusCalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Middle2 {

    public static void main(String[] args) {
        Manager manager = new Manager("Продаван", "Продаванцев", 35_000, new ArrayList<>());
        SmmManager smm = new SmmManager("Анна", "Видососнятова", 30_000, new ArrayList<>());
        Engineer engineer = new Engineer("Болт", "Винточович", 75_000, new ArrayList<>());

        KpiData managerKpi = new KpiData();
        managerKpi.setSalesAmount(500_000.0);

        KpiData smmKpi = new KpiData();
        smmKpi.setNewSubscribers(1000);

        KpiData engKpi = new KpiData();
        engKpi.setCompletedTasks(50);

        BonusCalculator calc = new BonusCalculator();
        calc.calculateAndAssignBonus(manager, managerKpi);
        calc.calculateAndAssignBonus(smm, smmKpi);
        calc.calculateAndAssignBonus(engineer, engKpi);

        List<Payable> payables = Arrays.asList(manager, smm, engineer);
        AccountingService service = new AccountingService();
        List<String> report = service.getSalarySummary(payables);

        for (String line : report) {
            System.out.println(line);
        }
    }
}

