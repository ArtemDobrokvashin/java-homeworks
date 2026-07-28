package test.service;
import main.model.*;
import main.service.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusCalculatorTest {

    @Test
    public void shouldAssignSalesBonusToManager() {
        Manager manager = new Manager("Ради", "БогаКупите", 50_000.0, new ArrayList<>());
        KpiData kpi = new KpiData();
        kpi.setSalesAmount(100_000.0);

        BonusCalculator calculator = new BonusCalculator();
        calculator.calculateAndAssignBonus(manager, kpi);

        assertEquals(60_000.0, manager.calculateTotalSalary());
    }
}